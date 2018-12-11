package com.pankaj.androidadvpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pankaj.androidadvpractice.adapters.RecyclerViewAdapter;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        ArrayList<String> namees = new ArrayList<String>();
        namees.add("Buenos Aires");
        namees.add("Córdoba");
        namees.add("La Plata");
        namees.add("Phonegap");
        namees.add("Cordova");
        namees.add("Python");
        namees.add("JAVa");
        namees.add("C++");
        namees.add("Android");
        namees.add("Oreo");
        namees.add("Pie");
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, namees);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
