package com.example.pokedextwo;

import java.util.List;

public class Pokemon {

    private String name;
    private String types;
    private int hp;
    private int attack;
    private int defense;
    private int sattack;
    private int sdefense;
    private int speed;
    private int imageResourceId;


    public Pokemon(String name, String types, int hp, int attack, int defense, int sattack, int sdefense, int speed, int imageResourceId) {
        this.name = name;
        this.types = types;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.sattack = sattack;
        this.sdefense = sdefense;
        this.speed = speed;
        this.imageResourceId = imageResourceId;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSattack() {
        return sattack;
    }

    public void setSattack(int sattack) {
        this.sattack = sattack;
    }

    public int getSdefense() {
        return sdefense;
    }

    public void setSdefense(int sdefense) {
        this.sdefense = sdefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }


}
