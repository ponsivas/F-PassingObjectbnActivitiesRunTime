package com.example.passingobjectbnactivitiesruntime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ID, NAME, CONTACT, EMAIL;
    Button CLEAR, SUBMIT;
    //Validation purpose String Variables declaraion.
    String valID,valNAME,valCONTACT,valEMAIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ID = (EditText) findViewById(R.id.ID);
        NAME = (EditText) findViewById(R.id.NAME);
        CONTACT = (EditText) findViewById(R.id.CNO);
        EMAIL = (EditText) findViewById(R.id.EMAIL);
        CLEAR = (Button) findViewById(R.id.CR);
        SUBMIT = (Button) findViewById(R.id.SBT);

        SUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Validation String Variables are assigned with the runtime value collections.
                valID = ID.getEditableText().toString();
                valNAME = NAME.getEditableText().toString();
                valCONTACT = CONTACT.getEditableText().toString();
                valEMAIL = EMAIL.getEditableText().toString();
                //Using if else decision making statement checking the values present in the input boxes.
                if (!valID.isEmpty() && !valNAME.isEmpty() && !valCONTACT.isEmpty() && !valEMAIL.isEmpty()) {

                    Toast toast = Toast.makeText(getApplicationContext(), "Entering to the Second Activity.", Toast.LENGTH_LONG);
                    toast.show();

                    Intent i = new Intent(getApplicationContext(), ObjectCollectorActivity.class);
                    //Object is passed to the variable "objectscollection" with the String Variables.
                    Studentdetails objectscollection = new Studentdetails(valID,valNAME,valCONTACT,valEMAIL);
                    //Using putExtra method the object is passed through the indent.
                    i.putExtra("Studentdetails", objectscollection);
                    startActivity(i);

                } else {

                    Toast toast = Toast.makeText(getApplicationContext(), "Enter the values in all the Input Boxes and SUBMIT.", Toast.LENGTH_LONG);
                    toast.show();

                }
            }
        });



        CLEAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ID.setText("");
                NAME.setText("");
                CONTACT.setText("");
                EMAIL.setText("");
            }
        });
    }
}
