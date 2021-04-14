package com.akhil.machine.coding.models;

public class Player {
    private int id;
    private String name;
    private int position;

    Player(int id, String name){
        this.id = id;
        this.name = name;
        this.position = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
