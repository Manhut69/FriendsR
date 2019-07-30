package com.example.clint.friendsr;

import java.io.Serializable;

public class Friend implements Serializable {

    /*
        A 'friend' class for an emoji
        it has a basic constructor and getters.
     */

    private String name, bio;
    private int drawableId;

    Friend(String name, String bio, int drawableId) {
        this.name = name;
        this.bio = bio;
        this.drawableId = drawableId;
    }

    public String getName() {
        return name;
    }

    String getBio() {
        return bio;
    }

    int getDrawableId() {
        return drawableId;
    }
}


