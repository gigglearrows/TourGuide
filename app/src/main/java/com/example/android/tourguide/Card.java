package com.example.android.tourguide;

/**
 * Card class that stores title, description and picture of each entry
 */

public class Card {
    private static final int NO_IMAGE = -1;

    private String description;
    private String title;
    private int imageResourceId = NO_IMAGE;

    public Card(String title, String description, int imageResourceId) {
        this.description = description;
        this.title = title;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE;
    }
}
