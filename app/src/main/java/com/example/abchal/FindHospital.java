package com.example.abchal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class FindHospital extends AppCompatActivity {
    String[] country = {"Select Hospital",
            "Karachi Institute of Heart Diseases",
            "Tabba Heart Institute", "Medicare Cardiac & General Hospital",
            "Tubba Heart Hospital", "Sindh Heart Hospital",
            "Tabba Heart Institute Emergency First Aid",
            "Hussaini Hospital","NICVD National Institute of Cardiovascular Diseases",
            "PAF Masroor Emergency Hospital","Darul Iftaa Wal Irshaad Abbas Goth Hazrat Sheikh",
            "Dr. Faraz Asim"
            ,"NICVD Chest Pain Unit at Gulshan Chowrangi Flyover","Cardio Centre Lyari General Hospital"};
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_hospital);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(FindHospital.this, android.R.layout.simple_list_item_1, country);
        ((ArrayAdapter) adapter).setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}