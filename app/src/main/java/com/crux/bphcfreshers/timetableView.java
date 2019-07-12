package com.crux.bphcfreshers;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_view);

        final EditText[] input = new EditText[1];

        final String[] input_Text = new String[1];

        createButtonsArray();

        for (int i=0; i<6; i++) {

            for (int j=0; j<9; j++) {

                final Button tempButton = buttonsArray.get(i).get(j);

                tempButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        AlertDialog.Builder builder = new AlertDialog.Builder(timetableView.this);
                        builder.setTitle("Enter Data");
                        builder.setIcon(R.drawable.ic_info_outline_black_24dp);
                        builder.setMessage("PLease Fill Class Info");

                        input[0] = new EditText(getApplicationContext());
                        builder.setView(input[0]);

                        builder.setPositiveButton("ENTER", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                input_Text[0] = input[0].getText().toString();
                                tempButton.animate().alpha(0).setDuration(100);

                            }
                        });

                        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });

                        builder.create().show();

                        tempButton.animate().alpha(1f).setDuration(150);

                    }
                });
            }
        }

    }
}



/**


 */