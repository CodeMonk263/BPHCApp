package com.crux.bphcfreshers;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class timetableView extends AppCompatActivity {

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

    public void createAlert(final Button tempButton) {

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

            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.create().show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_view);

        createButtonsArray();

        for (int i=0; i<6; i++) {

            for (int j=0; j<9; j++) {

                final Button tempButton = buttonsArray.get(i).get(j);

                tempButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        createAlert(tempButton);

                    }
                });
            }
        }

    }
}