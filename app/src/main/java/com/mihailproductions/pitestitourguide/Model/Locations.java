package com.mihailproductions.pitestitourguide.Model;

public class Locations {
    private String mName;
    private String mDescription;
    private int mPicture;

    public Locations(String mName, String mDescription, int mPicture) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.mPicture = mPicture;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getPicture() {
        return mPicture;
    }
}
