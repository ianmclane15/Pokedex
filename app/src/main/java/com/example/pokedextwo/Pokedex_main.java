package com.example.pokedextwo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Pokedex_main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Pokedex_main.this, pokemon_selector.class);
                    startActivity(intent);
                }
                else if (position == 2){
                    Intent intent = new Intent(Pokedex_main.this, MapActivity.class);
                    startActivity(intent);
                }
                else if (position == 1){
                    Intent intent = new Intent(Pokedex_main.this, TypeChart.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);

    }
}
