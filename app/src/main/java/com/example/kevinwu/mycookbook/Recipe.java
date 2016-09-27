package com.example.kevinwu.mycookbook;

/**
 * Created by Kevin on 9/24/2016.
 */
public class Recipe {

    private int mImageId;
    private String mRecipe;
    private String mfoodName;

    public Recipe(int imageId, String foodName, String recipe){
        mImageId = imageId;
        mRecipe = recipe;
        mfoodName = foodName;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getRecipe() {
        return mRecipe;
    }

    public void setRecipe(String mRecipe) {
        this.mRecipe = mRecipe;
    }

    public String getfoodName() {
        return mfoodName;
    }

    public void setfoodName(String mfoodName) {
        this.mfoodName = mfoodName;
    }
}
