package com.example.l1va.credittest;

import android.graphics.Bitmap;

public class PictureData {
    int resourceId;
    String description;
    Bitmap thumbnail;

    public PictureData(int resourceId, String description, Bitmap thumbnail) {
        this.resourceId = resourceId;
        this.description = description;
        this.thumbnail = thumbnail;
    }
}