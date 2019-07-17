package com.crux.bphcfreshers;

import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class timetableView extends AppCompatActivity {

    SQLiteDatabase timeTableDB;
    private StorageReference mStorageRef;


    public ArrayList<ArrayList<Button>> buttonsArray = new ArrayList<>(6);

    public void createButtonsArray() {

        buttonsArray.add(new ArrayList<Button>(9));
        buttonsArray.get(0).add((Button) findViewById(R.id.ttv_addButton1_1));
        buttonsArray.get(0).add((Button) findViewById(R.id.ttv_addButton1_2));
        buttonsArray.get(0).add((Button) findViewById(R.id.ttv_addButton1_3));
        buttonsArray.get(0).add((Button) findViewById(R.id.ttv_addButton1_4));
        buttonsArray.get(0).add((Button) findViewById(R.id.ttv_addButton1_5));
        buttonsArray.get(0).add((Button) findViewById(R.id.ttv_addButton1_6));
        buttonsArray.get(0).add((Button) findViewById(R.id.ttv_addButton1_7));
        buttonsArray.get(0).add((Button) findViewById(R.id.ttv_addButton1_8));
        buttonsArray.get(0).add((Button) findViewById(R.id.ttv_addButton1_9));


        buttonsArray.add(new ArrayList<Button>(9));
        buttonsArray.get(1).add((Button) findViewById(R.id.ttv_addButton2_1));
        buttonsArray.get(1).add((Button) findViewById(R.id.ttv_addButton2_2));
        buttonsArray.get(1).add((Button) findViewById(R.id.ttv_addButton2_3));
        buttonsArray.get(1).add((Button) findViewById(R.id.ttv_addButton2_4));
        buttonsArray.get(1).add((Button) findViewById(R.id.ttv_addButton2_5));
        buttonsArray.get(1).add((Button) findViewById(R.id.ttv_addButton2_6));
        buttonsArray.get(1).add((Button) findViewById(R.id.ttv_addButton2_7));
        buttonsArray.get(1).add((Button) findViewById(R.id.ttv_addButton2_8));
        buttonsArray.get(1).add((Button) findViewById(R.id.ttv_addButton2_9));


        buttonsArray.add(new ArrayList<Button>(9));
        buttonsArray.get(2).add((Button) findViewById(R.id.ttv_addButton3_1));
        buttonsArray.get(2).add((Button) findViewById(R.id.ttv_addButton3_2));
        buttonsArray.get(2).add((Button) findViewById(R.id.ttv_addButton3_3));
        buttonsArray.get(2).add((Button) findViewById(R.id.ttv_addButton3_4));
        buttonsArray.get(2).add((Button) findViewById(R.id.ttv_addButton3_5));
        buttonsArray.get(2).add((Button) findViewById(R.id.ttv_addButton3_6));
        buttonsArray.get(2).add((Button) findViewById(R.id.ttv_addButton3_7));
        buttonsArray.get(2).add((Button) findViewById(R.id.ttv_addButton3_8));
        buttonsArray.get(2).add((Button) findViewById(R.id.ttv_addButton3_9));


        buttonsArray.add(new ArrayList<Button>(9));
        buttonsArray.get(3).add((Button) findViewById(R.id.ttv_addButton4_1));
        buttonsArray.get(3).add((Button) findViewById(R.id.ttv_addButton4_2));
        buttonsArray.get(3).add((Button) findViewById(R.id.ttv_addButton4_3));
        buttonsArray.get(3).add((Button) findViewById(R.id.ttv_addButton4_4));
        buttonsArray.get(3).add((Button) findViewById(R.id.ttv_addButton4_5));
        buttonsArray.get(3).add((Button) findViewById(R.id.ttv_addButton4_6));
        buttonsArray.get(3).add((Button) findViewById(R.id.ttv_addButton4_7));
        buttonsArray.get(3).add((Button) findViewById(R.id.ttv_addButton4_8));
        buttonsArray.get(3).add((Button) findViewById(R.id.ttv_addButton4_9));


        buttonsArray.add(new ArrayList<Button>(9));
        buttonsArray.get(4).add((Button) findViewById(R.id.ttv_addButton5_1));
        buttonsArray.get(4).add((Button) findViewById(R.id.ttv_addButton5_2));
        buttonsArray.get(4).add((Button) findViewById(R.id.ttv_addButton5_3));
        buttonsArray.get(4).add((Button) findViewById(R.id.ttv_addButton5_4));
        buttonsArray.get(4).add((Button) findViewById(R.id.ttv_addButton5_5));
        buttonsArray.get(4).add((Button) findViewById(R.id.ttv_addButton5_6));
        buttonsArray.get(4).add((Button) findViewById(R.id.ttv_addButton5_7));
        buttonsArray.get(4).add((Button) findViewById(R.id.ttv_addButton5_8));
        buttonsArray.get(4).add((Button) findViewById(R.id.ttv_addButton5_9));


        buttonsArray.add(new ArrayList<Button>(9));
        buttonsArray.get(5).add((Button) findViewById(R.id.ttv_addButton6_1));
        buttonsArray.get(5).add((Button) findViewById(R.id.ttv_addButton6_2));
        buttonsArray.get(5).add((Button) findViewById(R.id.ttv_addButton6_3));
        buttonsArray.get(5).add((Button) findViewById(R.id.ttv_addButton6_4));
        buttonsArray.get(5).add((Button) findViewById(R.id.ttv_addButton6_5));
        buttonsArray.get(5).add((Button) findViewById(R.id.ttv_addButton6_6));
        buttonsArray.get(5).add((Button) findViewById(R.id.ttv_addButton6_7));
        buttonsArray.get(5).add((Button) findViewById(R.id.ttv_addButton6_8));
        buttonsArray.get(5).add((Button) findViewById(R.id.ttv_addButton6_9));

    }

    public void createAlert(final Button tempButton, final SQLiteDatabase myDB, final int day, final int hour) {

        final EditText[] input = new EditText[2];

        final TextView[] textfields = new TextView[2];

        final String[] input_Text = new String[2];

        AlertDialog.Builder builder = new AlertDialog.Builder(timetableView.this);

        LinearLayout linearLayout = new LinearLayout(timetableView.this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout sublinearLayout1 = new LinearLayout(timetableView.this);
        sublinearLayout1.setOrientation(LinearLayout.HORIZONTAL);
        textfields[0] = new TextView((getApplicationContext()));
        textfields[0].setText("Course:");
        textfields[0].setTextSize(20);
        textfields[0].setPadding(10,10,20,10);
        input[0] = new EditText(getApplicationContext());
        input[0].setWidth(500);
        sublinearLayout1.addView(textfields[0]);
        sublinearLayout1.addView(input[0]);

        LinearLayout sublinearLayout2 = new LinearLayout(timetableView.this);
        sublinearLayout2.setOrientation(LinearLayout.HORIZONTAL);
        textfields[1] = new TextView(getApplicationContext());
        textfields[1].setText("Class:");
        textfields[1].setTextSize(20);
        textfields[1].setPadding(10,10,20,10);
        input[1] = new EditText(getApplicationContext());
        input[1].setWidth(500);
        sublinearLayout2.addView(textfields[1]);
        sublinearLayout2.addView(input[1]);

        linearLayout.addView(sublinearLayout1);
        linearLayout.addView(sublinearLayout2);
        builder.setView(linearLayout);

        builder.setTitle("Enter Data");
        builder.setIcon(R.drawable.ic_info_outline_black_24dp);
        builder.setMessage("Please Fill Course Name, Class No.");

        builder.setPositiveButton("ENTER", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                input_Text[0] = input[0].getText().toString();
                input_Text[1] = input[1].getText().toString();

                String finalText = input_Text[0] + "\n" +input_Text[1];
                tempButton.setText(finalText);
                tempButton.setTextSize(12);
                tempButton.animate().alpha(1).setDuration(100);

                myDB.execSQL("INSERT INTO timetabledata (course, classroom, day, hour) VALUES ('" + input_Text[0] + "','" + input_Text[1] + "'," + day + "," + hour + ")");

            }
        });

        builder.setNegativeButton("DELETE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                tempButton.animate().alpha(0.1f).setDuration(100);
                tempButton.setText("ADD");
                myDB.execSQL("DELETE FROM timetabledata WHERE day = '" + day +"' AND hour = '" + hour + "'");
            }
        });

        builder.create().show();

    }

    public void createDB () {

        Log.i("created db", "Created");

        try {

            timeTableDB = timetableView.this.openOrCreateDatabase("TimeTable", MODE_PRIVATE, null );
            timeTableDB.execSQL("CREATE TABLE IF NOT EXISTS timetabledata (course VARCHAR, classroom VARCHAR, day INT(2), hour INT(2))");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_view);
        mStorageRef = FirebaseStorage.getInstance().getReference();

        Log.i("Start works", "Working");

        createDB();

        createButtonsArray();

        for (int i=0; i<6; i++) {

            for (int j=0; j<9; j++) {

                Log.i("Main Loop Works", "Working");

                final Button tempButton = buttonsArray.get(i).get(j);

                Cursor c = timeTableDB.rawQuery("SELECT * FROM timetabledata", null);
                int courseIndex = c.getColumnIndex("course");
                int classroomIndex = c.getColumnIndex("classroom");
                int dayIndex = c.getColumnIndex("day");
                int hourIndex = c.getColumnIndex("hour");

                final int tempDay = i;
                final int tempHour = j;

                if (c.moveToFirst()) {
                    do{
                        if (tempDay == c.getInt(dayIndex) && tempHour == c.getInt(hourIndex)) {
                            Log.i("If works", "Working");
                            String finalText = c.getString(courseIndex) + "\n" + c.getString(classroomIndex);
                            tempButton.setText(finalText);
                            tempButton.setTextSize(12);
                            tempButton.animate().alpha(1).setDuration(100);
                        }
                        else {
                            Log.i("Else works", "Working");
                            tempButton.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    createAlert(tempButton, timeTableDB, tempDay, tempHour);
                                }
                            });
                        }
                    } while (c.moveToNext());
                }
                c.close();

                Log.i("Else works", "Working");
                tempButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        createAlert(tempButton, timeTableDB, tempDay, tempHour);
                    }
                });
            }
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.timetable_reset_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.reset:
                Log.i("sdfsd", "fdsdf");
                timeTableDB.execSQL("DROP TABLE IF EXISTS timetabledata");

                for (int i=0; i<6; i++) {
                    for (int j=0; j<9; j++) {
                        Button resetButton = buttonsArray.get(i).get(j);
                        resetButton.animate().alpha(0.1f).setDuration(10);
                        resetButton.setText("ADD");
                    }
                }
        }

        return super.onOptionsItemSelected(item);
    }

}