package com.tomkuenzler.skippersapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class Desserts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
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
        MenuItem dessertsData = new MenuItem();
        dessertsData.setItem("Keylime Pie");
        dessertsData.setIngredients("It's a secret");
        dessertsData.setInstructions("Keep cool and enjoy");
        results.add(dessertsData);

        dessertsData = new MenuItem();
        dessertsData.setItem("Ice cream Sandwhiches");
        dessertsData.setIngredients("");
        dessertsData.setInstructions("");
        results.add(dessertsData);

        dessertsData = new MenuItem();
        dessertsData.setItem("Peanut Butter Bomb");
        dessertsData.setIngredients("");
        dessertsData.setInstructions("");
        results.add(dessertsData);

        dessertsData = new MenuItem();
        dessertsData.setItem("Dark Side of the Moon");
        dessertsData.setIngredients("");
        dessertsData.setInstructions("");
        results.add(dessertsData);

        dessertsData = new MenuItem();
        dessertsData.setItem("Chocolate Lava");
        dessertsData.setIngredients("");
        dessertsData.setInstructions("");
        results.add(dessertsData);

        dessertsData = new MenuItem();
        dessertsData.setItem("Coconut Snowball");
        dessertsData.setIngredients("");
        dessertsData.setInstructions("");
        results.add(dessertsData);

        dessertsData = new MenuItem();
        dessertsData.setItem("Jim Beam Banana");
        dessertsData.setIngredients("");
        dessertsData.setInstructions("");
        results.add(dessertsData);

        dessertsData = new MenuItem();
        dessertsData.setItem("Death by Chocolate");
        dessertsData.setIngredients("");
        dessertsData.setInstructions("");
        results.add(dessertsData);

//        dessertsData = new MenuItem();
//        dessertsData.setItem("");
//        dessertsData.setIngredients("");
//        dessertsData.setInstructions("");
//        results.add(dessertsData);



        return results;
    }

}
