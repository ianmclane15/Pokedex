package com.example.pokedextwo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Pokemon_activity extends AppCompatActivity {

    public static final String EXTRA_POKEMONID = "pokemonID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        final int poksId = (Integer)getIntent().getExtras().get(EXTRA_POKEMONID);
        Pokemon p = PokemonFamily.poks[poksId];

        TextView name = (TextView)findViewById(R.id.textview_main_name);
        name.setText(p.getName());

        View someView = findViewById(R.id.layout_main_background);
        View root = someView.getRootView();

        if(p.getTypes().contains("fire") || p.getTypes().contains("fire, flying")){

            root.setBackgroundColor(Color.parseColor("#FFA07A"));
        }
        else if(p.getTypes().contains("grass, poison")){
            root.setBackgroundColor(Color.parseColor("#98FB98"));
        }
        else{
            root.setBackgroundColor(Color.parseColor("#AFEEEE"));
        }

        TextView hp = (TextView)findViewById(R.id.textview_main_hp);
        hp.setText("HP: " + p.getHp());

        TextView attack = (TextView)findViewById(R.id.textview_main_attack);
        attack.setText("Attack: "+p.getAttack());

        TextView defense = (TextView)findViewById(R.id.textview_main_defense);
        defense.setText("Defense: "+p.getDefense());

        TextView spatk = (TextView)findViewById(R.id.textview_main_speicialattack);
        spatk.setText("Sp. Atk: "+p.getSattack());

        TextView spdef = (TextView)findViewById(R.id.textview_main_specialdefense);
        spdef.setText("Sp. Def: "+p.getSdefense());

        TextView speed = (TextView)findViewById(R.id.textview_main_speed);
        speed.setText("Speed: "+p.getSpeed());

        TextView type = (TextView)findViewById(R.id.textView_main_types);
        type.setText("Types: "+p.getTypes());

        ImageButton evo1 = (ImageButton)findViewById(R.id.photo_main_evo1);

        ImageButton evo2 = (ImageButton)findViewById(R.id.photo_main_evo2);

        ImageButton evo3 = (ImageButton)findViewById(R.id.photo_main_evo3);

        if(p.equals(PokemonFamily.charFamily.getFirst()) || p.equals(PokemonFamily.charFamily.getSecond()) || p.equals(PokemonFamily.charFamily.getThird())) {
            evo1.setImageResource(PokemonFamily.charFamily.getFirst().getImageResourceId());
            evo2.setImageResource(PokemonFamily.charFamily.getSecond().getImageResourceId());
            evo3.setImageResource(PokemonFamily.charFamily.getThird().getImageResourceId());
        }
        else if(p.equals(PokemonFamily.bulbFamily.getFirst()) || p.equals(PokemonFamily.bulbFamily.getSecond()) || p.equals(PokemonFamily.bulbFamily.getThird())) {
            evo1.setImageResource(PokemonFamily.bulbFamily.getFirst().getImageResourceId());
            evo2.setImageResource(PokemonFamily.bulbFamily.getSecond().getImageResourceId());
            evo3.setImageResource(PokemonFamily.bulbFamily.getThird().getImageResourceId());
        }
        else{
            evo1.setImageResource(PokemonFamily.turtleFamily.getFirst().getImageResourceId());
            evo2.setImageResource(PokemonFamily.turtleFamily.getSecond().getImageResourceId());
            evo3.setImageResource(PokemonFamily.turtleFamily.getThird().getImageResourceId());
        }

        if(p.equals(PokemonFamily.charFamily.getFirst()) || p.equals(PokemonFamily.charFamily.getSecond()) || p.equals(PokemonFamily.charFamily.getThird())) {
            evo1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pokemon_activity.this, Pokemon_activity.class);

                    intent.putExtra(Pokemon_activity.EXTRA_POKEMONID, 0);
                    startActivity(intent);
                }
            });
            evo2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pokemon_activity.this, Pokemon_activity.class);

                    intent.putExtra(Pokemon_activity.EXTRA_POKEMONID, 1);
                    startActivity(intent);
                }
            });
            evo3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pokemon_activity.this, Pokemon_activity.class);

                    intent.putExtra(Pokemon_activity.EXTRA_POKEMONID, (int) 2);
                    startActivity(intent);
                }
            });
        }
        else if(p.equals(PokemonFamily.bulbFamily.getFirst()) || p.equals(PokemonFamily.bulbFamily.getSecond()) || p.equals(PokemonFamily.bulbFamily.getThird())) {
            evo1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pokemon_activity.this, Pokemon_activity.class);

                    intent.putExtra(Pokemon_activity.EXTRA_POKEMONID, 3);
                    startActivity(intent);
                }
            });
            evo2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pokemon_activity.this, Pokemon_activity.class);

                    intent.putExtra(Pokemon_activity.EXTRA_POKEMONID, 4);
                    startActivity(intent);
                }
            });
            evo3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pokemon_activity.this, Pokemon_activity.class);

                    intent.putExtra(Pokemon_activity.EXTRA_POKEMONID, (int) 5);
                    startActivity(intent);
                }
            });
        }
        else{
            evo1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pokemon_activity.this, Pokemon_activity.class);

                    intent.putExtra(Pokemon_activity.EXTRA_POKEMONID, 6);
                    startActivity(intent);
                }
            });
            evo2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pokemon_activity.this, Pokemon_activity.class);

                    intent.putExtra(Pokemon_activity.EXTRA_POKEMONID, 7);
                    startActivity(intent);
                }
            });
            evo3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Pokemon_activity.this, Pokemon_activity.class);

                    intent.putExtra(Pokemon_activity.EXTRA_POKEMONID, (int) 8);
                    startActivity(intent);
                }
            });

        }








        ImageView photo = (ImageView)findViewById(R.id.photo_main_pokemon);
        photo.setImageResource(p.getImageResourceId());
        photo.setContentDescription(p.getName());

    }




}
