package com.tomkuenzler.skippersapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class FreshFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresh_food);
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
        MenuItem freshFoodData = new MenuItem();
        freshFoodData.setItem("Clams");
        freshFoodData.setIngredients("");
        freshFoodData.setInstructions("");
        results.add(freshFoodData);

        freshFoodData = new MenuItem();
        freshFoodData.setItem("Crabs");
        freshFoodData.setIngredients("");
        freshFoodData.setInstructions("");
        results.add(freshFoodData);

        freshFoodData = new MenuItem();
        freshFoodData.setItem("Mussels");
        freshFoodData.setIngredients("");
        freshFoodData.setInstructions("");
        results.add(freshFoodData);

        freshFoodData = new MenuItem();
        freshFoodData.setItem("Oysters");
        freshFoodData.setIngredients("");
        freshFoodData.setInstructions("");
        results.add(freshFoodData);

        freshFoodData = new MenuItem();
        freshFoodData.setItem("Fish");
        freshFoodData.setIngredients("");
        freshFoodData.setInstructions("");
        results.add(freshFoodData);

        freshFoodData = new MenuItem();
        freshFoodData.setItem("Shrimp");
        freshFoodData.setIngredients("");
        freshFoodData.setInstructions("");
        results.add(freshFoodData);

//        freshFoodData = new MenuItem();
//        freshFoodData.setItem("");
//        freshFoodData.setIngredients("");
//        freshFoodData.setInstructions("");
//        results.add(freshFoodData);

        return results;
    }

}
