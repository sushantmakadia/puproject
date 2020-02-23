package com.example.pu_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class fetchdata {
    Button b1;
    EditText e1;

    private void batch() {
        Random rand = new Random();

        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2",  };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }
        int numberOfElements = 3;
        for (int j = 0; j < numberOfElements; j++) {

            for (int i = 0; i < numberOfElements; i++) {
                int randomIndex = rand.nextInt(list.size());
                String randomElement = list.get(randomIndex);
                System.out.println("b" + j + "=" + randomElement);
                list.remove(randomIndex);
            }

        }
    }
}
