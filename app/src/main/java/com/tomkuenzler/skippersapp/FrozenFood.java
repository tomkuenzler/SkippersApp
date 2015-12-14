package com.tomkuenzler.skippersapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class FrozenFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frozen);
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
        MenuItem frozenFoodData = new MenuItem();
        frozenFoodData.setItem("King Crab Legs");
        frozenFoodData.setIngredients("");
        frozenFoodData.setInstructions("");
        results.add(frozenFoodData);

        frozenFoodData = new MenuItem();
        frozenFoodData.setItem("Snow Crab Legs");
        frozenFoodData.setIngredients("");
        frozenFoodData.setInstructions("");
        results.add(frozenFoodData);

        frozenFoodData = new MenuItem();
        frozenFoodData.setItem("Dungeness Crab Legs");
        frozenFoodData.setIngredients("");
        frozenFoodData.setInstructions("");
        results.add(frozenFoodData);

        frozenFoodData = new MenuItem();
        frozenFoodData.setItem("Lobster Tails");
        frozenFoodData.setIngredients("");
        frozenFoodData.setInstructions("");
        results.add(frozenFoodData);

        frozenFoodData = new MenuItem();
        frozenFoodData.setItem("Shrimp");
        frozenFoodData.setIngredients("");
        frozenFoodData.setInstructions("");
        results.add(frozenFoodData);


//        frozenFoodData = new MenuItem();
//        frozenFoodData.setItem("");
//        frozenFoodData.setIngredients("");
//        frozenFoodData.setInstructions("");
//        results.add(frozenFoodData);

        return results;
    }

}
