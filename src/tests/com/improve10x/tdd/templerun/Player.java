package com.improve10x.tdd.templerun;

public class Player {
    private String name;
    public Player(String name) {
        if (name == null) {
            this.name = "";
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }
}
