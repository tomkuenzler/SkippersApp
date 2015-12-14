package com.tomkuenzler.skippersapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class PreparedFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepared);
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
        MenuItem preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Grouper Pinwheels");
        preparedFoodData.setIngredients("Grouper, crabmeat, celery, onions, mayo, hot sauce, Worcestershire sauce, panko bread crumbs and spices.");
        preparedFoodData.setInstructions("Preheat oven to 375 degrees.  Put pinwheels on greased baking pan and bake approx. 10 to 15 minutes until fish easily flakes.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Citrus Grouper");
        preparedFoodData.setIngredients("Grouper, lemon and lime zest, panko bread crumbs");
        preparedFoodData.setInstructions("Pan fry with light oil in frying pan, 3 or 4 minutes each side. To bake spray with light cooking spray and bake at 375 for 8-10 minutes. Or for both ways until desired level of golden brown.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Lobster and Crab Stuffed Mushrooms");
        preparedFoodData.setIngredients("Mushrooms, seasoned croutons, mozzarella cheese, crabmeat, lobster meat, garlic and butter.");
        preparedFoodData.setInstructions("Preheat oven to 375 degrees.  Spray baking sheet with oil so mushrooms don’t stick. Bake for 10 to 12 minutes.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Half Stuffed Lobster");
        preparedFoodData.setIngredients("Lobster, snowcrab meat, celery, onion, mayo, hot sauce, worchershire sauce, panko bread crumbs and spices.");
        preparedFoodData.setInstructions("Lobster is fully cooked so you are heating the stuffing only by covering the tail with aluminum foil and placing lobster under broiler for 3 to 5 minutes to brown stuffing.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Homemade Crabcakes");
        preparedFoodData.setIngredients("Crabmeat, celery, onion, mayo, crab spice, panko bread crumbs, spices.");
        preparedFoodData.setInstructions("Put a little oil/butter/or Pam in hot frying pan. Sear both sides of crab cakes and they will form crust. Turn down heat to medium and cover for approximately 5 minutes or until heated through.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Portabello Mushroom w/ Jumbo Lump Crabmeat");
        preparedFoodData.setIngredients("Portabello mushroom, crabmeat, mayo, mustard, Worcestershire sauce");
        preparedFoodData.setInstructions("Preheat oven to 350 degrees and bake for 25 minutes or until top is lightly brown….can be cooked on grill on aluminum foil.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Deviled Crab in Natural Shell");
        preparedFoodData.setIngredients("Crabmeat, bread crumbs,green pepper, spices.");
        preparedFoodData.setInstructions("Pre-heat oven to 400 degrees, place on baking sheet and bake 30 minutes.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Crab Imperial");
        preparedFoodData.setIngredients("crabmeat, mayo, green pepper, bread , worchershire sauce, dry mustard, egg");
        preparedFoodData.setInstructions("Broil for 3 to 4 minutes until brown/or bake at 350 degrees until top browns, 8 to 10 minutes.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Clams Casino");
        preparedFoodData.setIngredients("Clams, green pepper, onions, bacon, garlic, bread crumbs, oregano,spice");
        preparedFoodData.setInstructions("Bake at 350 degrees for 8 to 10 minutes");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Crab Bake");
        preparedFoodData.setIngredients("snowcrab, green peppers, onions,celery, cheese, milk, bisquick, eggs, spices");
        preparedFoodData.setInstructions("Fully cooked…reheat one slice wrapped in paper towel in microwave for 30 seconds or slip whole pie onto microwaveable dish and microwave 3 minutes..or cover with foil and re-heat in 325 degree oven for 8 to 10 min.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Lobster Stuffed Jalapenos");
        preparedFoodData.setIngredients("");
        preparedFoodData.setInstructions("Bake at 425 for 8-11 minutes. Watch to make sure the filling is not burning");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Snowcrab and Horseradish Mushrooms");
        preparedFoodData.setIngredients("mushrooms, snowcrab, mayo, celery, onion, horseradish, bread crumbs, spices");
        preparedFoodData.setInstructions("Pre-heat oven to 350 degrees and bake for 8 to 10 min.\n");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Crab Potato Skins");
        preparedFoodData.setIngredients("potato, crabmeat, cream cheese, mozz. cheese, spices");
        preparedFoodData.setInstructions("Bake in pre-heated 375 oven for approx. 10 minutes until top browns");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Conch Fritters");
        preparedFoodData.setIngredients("conch, green pepper, onion,celery, jalepano peppers, garlic, hot sauce, flour, milk, eggs, baking powder, spices.");
        preparedFoodData.setInstructions("Fully cooked..but to re-heat microwave in paper towel for 10 seconds or until hot or put in oven at 325 degrees for 8 to 10 minutes.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Crab Bread");
        preparedFoodData.setIngredients("crabmeat, sour cream, lemon juice, garlic, parsley, swiss cheese, bread");
        preparedFoodData.setInstructions("Bake at 350 degrees for 15 minutes or until golden brown on top.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Oysters Rockefeller");
        preparedFoodData.setIngredients("oysters, spinach, mayo, hot sauce, garlic, anise, spices");
        preparedFoodData.setInstructions("Broil until sauce starts to bubble and lightly browns.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Clams Casino Pie");
        preparedFoodData.setIngredients("clams, onions, green pepper, garlic, bacon, bisquick, milk, eggs, spice");
        preparedFoodData.setInstructions("Fully cooked. To re-heat take out of aluminum pan by cutting around edge with knife and place on microwave dish. Microwave for 30 seconds to 1 minute or place in pre-heated 325 degree oven for 8 minutes.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Fish Cakes");
        preparedFoodData.setIngredients("fish, potato, green pepper, onions, celery, milk, breadcrumbs, spices.");
        preparedFoodData.setInstructions("Fully cooked...re-heat in microwave til hot or oven at 325 for 10 minutes.");
        results.add(preparedFoodData);

        preparedFoodData = new MenuItem();
        preparedFoodData.setItem("Flounder Stuffed with Crabmeat");
        preparedFoodData.setIngredients("Flounder, crabmeat, celery, onion, mayo, crab spice, hot sauce, bread crumbs, spices.");
        preparedFoodData.setInstructions("Place flounder in baking dish with a small amount of water so it does not stick to baking dish.  Pre-heat oven to 375 degrees. Brush with a little butter, margarine, mayo or olive oil.  Bake for 15 to 20 minutes. Fish will be white and flaky when done.");
        results.add(preparedFoodData);




//        foodData = new MenuItem();
//        foodData.setItem("");
//        foodData.setIngredients("");
//        foodData.setInstructions("");
//        results.add(foodData);


        return results;
    }

}
