package com.example.pokedextwo;

public class PokemonFamily {

    public Pokemon first;
    public Pokemon second;
    public Pokemon third;
    public String famName;

    private static Pokemon charmander = new Pokemon("Charmander","fire", 39, 52, 43, 60, 50, 65, R.drawable.charmander);
    private static Pokemon charmeleon = new Pokemon("Charmeleon","fire", 58, 64, 58, 80, 65, 80, R.drawable.charmeleon);
    private static Pokemon charizard = new Pokemon("Charizard", "fire, flying", 78, 84, 78, 109, 85, 100, R.drawable.charizard);
    private static Pokemon bulbasaur = new Pokemon("Bulbasaur", "grass, poison", 45, 49, 49, 65, 65, 45, R.drawable.bulbasaur);
    private static Pokemon ivysaur = new Pokemon("Ivysaur", "grass, poison" , 60, 62, 63, 80, 80, 60, R.drawable.ivysaur);
    private static Pokemon venusaur = new Pokemon("Venusaur", "grass poison", 80, 82, 83, 100, 100, 80, R.drawable.venusaur);
    private static Pokemon squirtle = new Pokemon("Squirtle", "water", 44, 48, 65, 50, 64, 43, R.drawable.squirtle);
    private static Pokemon wartortle = new Pokemon("Wartortle", "water", 59, 63, 80, 65, 80, 58, R.drawable.wartortle);
    private static Pokemon blastoise = new Pokemon("Blastoise", "water", 79, 83, 100, 85, 105, 78, R.drawable.blastoise);

    public static final PokemonFamily charFamily = new PokemonFamily(charmander, charmeleon, charizard, "Char Family");
    public static final PokemonFamily bulbFamily = new PokemonFamily(bulbasaur, ivysaur, venusaur, "Bulb Family");
    public static final PokemonFamily turtleFamily = new PokemonFamily(squirtle, wartortle, blastoise, "Turtle Family");

    public static final Pokemon[] poks = {charmander, charmeleon, charizard, bulbasaur, ivysaur, venusaur, squirtle, wartortle, blastoise};


    public PokemonFamily(Pokemon first, String famName) {
        this.first = first;
        this.famName = famName;
    }

    public PokemonFamily(Pokemon first, Pokemon second, String famName) {
        this.first = first;
        this.second = second;
        this.famName = famName;
    }

    public PokemonFamily(Pokemon first, Pokemon second, Pokemon third, String famName) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.famName = famName;
    }

    public Pokemon getFirst() {
        return first;
    }

    public void setFirst(Pokemon first) {
        this.first = first;
    }

    public Pokemon getSecond() {
        return second;
    }

    public void setSecond(Pokemon second) {
        this.second = second;
    }

    public Pokemon getThird() {
        return third;
    }

    public void setThird(Pokemon third) {
        this.third = third;
    }

    public String getFamName() {
        return famName;
    }

    public void setFamName(String famName) {
        this.famName = famName;
    }
}
