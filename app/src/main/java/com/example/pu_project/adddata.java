package com.example.pu_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class adddata extends AppCompatActivity {
EditText e1,e2;
Button b1;
int c=1;
String sname,ssurname,sid=null;
    FirebaseDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddata);
         database = FirebaseDatabase.getInstance();
      //  DatabaseReference myRef = database.getReference("students");
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);

        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname=e1.getText().toString();
                ssurname=e2.getText().toString();

                DatabaseReference myRef1 = database.getReference().child(String.valueOf(c)).child("name");
                myRef1.setValue(sname);
                DatabaseReference myRef2 = database.getReference().child(String.valueOf(c)).child("surname");
                myRef2.setValue(ssurname);
                DatabaseReference myRef3 = database.getReference("students").child(String.valueOf(c)).child("id");
                myRef3.setValue(sid);
                c++;
            }
        });
    }
}
