package com.improve10x.tdd.templerun;

public class Obstacle {

    public String name;
    public int damage;

    public Obstacle(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void collide(Character character) {
        System.out.println(name + "has collided with " + character.getName() + "and cause " + damage + "damage.");
        character.reduceHealth(damage);
    }
}
