package com.example.pu_project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.snapshot.ChildKey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.example.pu_project.admin.arrayList;

public class batches extends AppCompatActivity {
Button b1;
EditText e1;
ListView l1;
    DatabaseReference myref;
    int randomIndex;
List<String> batchlist= new ArrayList<>();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batches);

        b1 = findViewById(R.id.b1);
        e1 = findViewById(R.id.e1);
        l1=findViewById(R.id.l1);
       adapter= new ArrayAdapter<String>(this,R.layout.list_view,batchlist);
        System.out.println(arrayList.size());


            batch();

    }



    private void batch() {
        Random rand = new Random();


        int numberOfElements = 2;
        for (int j = 0; j < numberOfElements; j++) {
            batchlist.add("batch "+j);

            for (int i = 0; i < numberOfElements; i++) {

                try {
               randomIndex = rand.nextInt(arrayList.size());

                //String randomElement = arrayList.get(rand.nextInt(arrayList.size()));
                String randomElement=arrayList.get(randomIndex);
                batchlist.add(randomElement);
                System.out.println("b" + j + "=" + randomElement);


                    arrayList.remove(randomIndex);

                    System.out.println(arrayList);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }


        }
        l1.setAdapter(adapter);
arrayList.clear();
    }




}
