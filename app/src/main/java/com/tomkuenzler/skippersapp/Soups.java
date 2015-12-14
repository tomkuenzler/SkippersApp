package com.tomkuenzler.skippersapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Soups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soups);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        ArrayList image_details = getListData();
        final ListView lv1 = (ListView) findViewById(R.id.custom_list);
        lv1.setAdapter(new CustomListAdapter(this, image_details));
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                MenuItem soupData = (MenuItem) o;
                Toast.makeText(Soups.this, "Selected: " + soupData, Toast.LENGTH_LONG).show();
            }
        });


    }

    private ArrayList getListData() {
        ArrayList<MenuItem> results = new ArrayList<MenuItem>();
        MenuItem soupData = new MenuItem();
        soupData.setItem("Lobster Bisque");
        soupData.setIngredients("");
        soupData.setInstructions("Heat in microwave for 60 seconds");
        results.add(soupData);

        soupData = new MenuItem();
        soupData.setItem("Cream of Crab");
        soupData.setIngredients("");
        soupData.setInstructions("Heat in microwave for 60 seconds");
        results.add(soupData);

        soupData = new MenuItem();
        soupData.setItem("New England Clam Chowder");
        soupData.setIngredients("");
        soupData.setInstructions("Heat in microwave for 60 seconds");
        results.add(soupData);

        soupData = new MenuItem();
        soupData.setItem("Manhattan Clam Chowder");
        soupData.setIngredients("");
        soupData.setInstructions("Heat in microwave for 60 seconds");
        results.add(soupData);

//        soupData = new MenuItem();
//        soupData.setItem("");
//        soupData.setIngredients("");
//        soupData.setInstructions("");
//        results.add(soupData);


        return results;
    }

}
