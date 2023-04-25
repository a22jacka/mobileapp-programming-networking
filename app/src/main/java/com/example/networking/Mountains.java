package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountains {
    private String name;
    private String ID;
    @SerializedName("size")//when encountiring this name in JSON, use name under instead
    private int height;

    public Mountains(String name, String ID, int height) {
        this.name = name;
        this.ID = ID;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountains{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", height=" + height +
                '}';
    }
}
