package com.tomkuenzler.skippersapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] menuArray = { "Soups", "Salads", "Prepared Foods", "Fresh", "Frozen", "Desserts"};

    private ListView menuListview;
    private ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        menuListview = (ListView) findViewById(R.id.menu_listView);

        arrayAdapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1, menuArray);
        menuListview.setAdapter(arrayAdapter);
        menuListview.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d("menu", position + ":" + id);
        Intent soupsIntent = new Intent(this, Soups.class);
        Intent saladsIntent = new Intent(this, Salads.class);
        Intent preparedIntent = new Intent(this, PreparedFood.class);
        Intent freshIntent = new Intent(this, FreshFood.class);
        Intent frozenIntent = new Intent(this, FrozenFood.class);
        Intent dessertsIntent = new Intent(this, Desserts.class);

        switch (position) {
            case 0:
                startActivity(soupsIntent);
                break;
            case 1:
                startActivity(saladsIntent);
                break;
            case 2:
                startActivity(preparedIntent);
                break;
            case 3:
                startActivity(freshIntent);
                break;
            case 4:
                startActivity(frozenIntent);
                break;
            case 5:
                startActivity(dessertsIntent);
                break;
        }

    }
}
