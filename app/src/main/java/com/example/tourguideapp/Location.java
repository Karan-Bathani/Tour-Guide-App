package com.example.tourguideapp;

public class Location {

    private int mImageResourceId;
    private int mNameStringId;
    private int mAddressStringId;

    public Location(int mImageResourceId, int mNameStringId, int mAddressStringId) {
        this.mImageResourceId = mImageResourceId;
        this.mNameStringId = mNameStringId;
        this.mAddressStringId = mAddressStringId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmNameStringId() {
        return mNameStringId;
    }

    public int getmAddressStringId() {
        return mAddressStringId;
    }
}
