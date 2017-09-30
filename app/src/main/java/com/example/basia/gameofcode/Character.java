package com.example.basia.gameofcode;

import android.graphics.Bitmap;

/**
 * Created by basia on 30.09.17.
 */

public class Character {
    String name;
    String house;
    boolean isAlive;
    String gender;
    String photoPath;
    Bitmap photo;

    public Character(String name, String house, boolean isAlive,
                     String gender, String photoPath, Bitmap photo) {
        this.name = name;
        this.house = house;
        this.isAlive = isAlive;
        this.gender = gender;
        this.photoPath = photoPath;
        this.photo = photo;
    }


    public Character() {
    }
}
