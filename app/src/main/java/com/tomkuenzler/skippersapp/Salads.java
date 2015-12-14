package com.tomkuenzler.skippersapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class Salads extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salads);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        ArrayList image_details = getListData();
        final ListView lv1 = (ListView) findViewById(R.id.custom_list);
        lv1.setAdapter(new CustomListAdapter(this, image_details));
    }

    private ArrayList getListData() {
        ArrayList<MenuItem> results = new ArrayList<MenuItem>();
        MenuItem saladData = new MenuItem();
        saladData.setItem("Coleslaw");
        saladData.setIngredients("");
        //saladData.setInstructions("");
        results.add(saladData);

        saladData = new MenuItem();
        saladData.setItem("Seafood Salad");
        saladData.setIngredients("");
        //saladData.setInstructions("");
        results.add(saladData);

        saladData = new MenuItem();
        saladData.setItem("Potato Salad");
        saladData.setIngredients("");
        //saladData.setInstructions("");
        results.add(saladData);

        saladData = new MenuItem();
        saladData.setItem("Broccoli Salad");
        saladData.setIngredients("");
        //saladData.setInstructions("");
        results.add(saladData);

        saladData = new MenuItem();
        saladData.setItem("Bunkhouse Beans");
        saladData.setIngredients("");
        //saladData.setInstructions("");
        results.add(saladData);

        saladData = new MenuItem();
        saladData.setItem("Caribbean Salad");
        saladData.setIngredients("");
        //saladData.setInstructions("");
        results.add(saladData);

        saladData = new MenuItem();
        saladData.setItem("Seaweed Salad");
        saladData.setIngredients("");
        //saladData.setInstructions("");
        results.add(saladData);

        return results;
    }

}
