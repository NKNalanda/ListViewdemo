package com.example.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

        final ArrayList<String> myFamilyList = new ArrayList<String>();

        myFamilyList.add("Nishant");
        myFamilyList.add("Manish");
        myFamilyList.add("Avnish");
        myFamilyList.add("Suraj");

//        final ArrayList<String> myFamilyList = new ArrayList<String>(asList("Nishant","Manish","Avnish","Suraj"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myFamilyList);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"Hello "+myFamilyList.get(position),Toast.LENGTH_SHORT).show();

                Log.i("Person tapped: ",myFamilyList.get(position));
            }
        });

    }
}
