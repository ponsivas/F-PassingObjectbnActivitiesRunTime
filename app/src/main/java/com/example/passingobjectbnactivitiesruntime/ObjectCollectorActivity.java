package com.example.passingobjectbnactivitiesruntime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ObjectCollectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_collector);
        //From the first activity the passed object is collected in this with "getSerializableExtra" method.
        Studentdetails objectscollection = (Studentdetails) getIntent().getSerializableExtra("Studentdetails");
        TextView RESULT = findViewById(R.id.RES);
        //The collected object is presented on the second activity with the TextView Widget.
        RESULT.setText("Student ID: " + objectscollection.Id + "\n" + "Student NAME: " +  objectscollection.Name + "\n" + "Contact No.: " + objectscollection.Contact + "\n" + "Email ID: " + objectscollection.Email);
    }
}