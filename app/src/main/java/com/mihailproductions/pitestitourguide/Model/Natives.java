package com.mihailproductions.pitestitourguide.Model;

public class Natives {
    private String mName;
    private int mPicture;

    public Natives(String mName, int mPicture) {
        this.mName = mName;
        this.mPicture = mPicture;
    }

    public String getName() {
        return mName;
    }

    public int getPicture() {
        return mPicture;
    }
}
