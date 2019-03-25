package com.example.pokedextwo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class pokemon_selector extends AppCompatActivity {
    //region Instance Variables
    private ListView listView;
    //endregion

    //region Overridden Android LifeCycle Methods (e.g. onCreate)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_selector);
        //wire the ListView
        listView = findViewById(R.id.list_pokemon);
        //instantiate the custom adapter that is defined later
        PokemonAdapter pokemonAdapter =
                new PokemonAdapter(this, R.layout.item_pokemon,   //R.layout.list_pokemon
                        PokemonFamily.poks);
        //set the adapter to the listView
        listView.setAdapter(pokemonAdapter);
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(pokemon_selector.this, Pokemon_activity.class);

                        intent.putExtra(Pokemon_activity.EXTRA_POKEMONID, (int) id);
                        startActivity(intent);
                   }
                };
         listView.setOnItemClickListener(itemClickListener);
    }
    //endregion

    //region Custom Adapter Definition: It's a class within a class, AKA an Inner Class
    private class PokemonAdapter extends ArrayAdapter<Pokemon> {
        //just like any regular class, inner classes can store instance variables
        private int layout;
        private Context context;
        private Pokemon[] list;

        public PokemonAdapter(Context context, int resource, Pokemon[] list) {
            //this constructor has the superclass do its setup and then stores
            //the values passed in as arguments into the instance variables.
            super(context, resource, list);
            this.layout = resource;
            this.context = context;
            this.list = list;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null)
                convertView = LayoutInflater.from(context).inflate(layout,null);

            //wire up the Views in your layout that you want to put your data in
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview_picture);
 //           TextView headline = convertView.findViewById(R.id.text_view_headline);
            TextView desc = convertView.findViewById(R.id.textView_name);

            //put the data that you got from your model object into those views
            imageView.setImageResource(list[position].getImageResourceId());
            desc.setText(list[position].getName());

            //now that the view has been fully set up, we return it
            return convertView;
        }

    }
}