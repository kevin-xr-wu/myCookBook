package com.example.kevinwu.mycookbook;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Kevin on 9/22/2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private SharedPreferences preferences;
    private final String MY_PREFS_NAME = "myPreferences";
    private final String LOG_TAG = "myLogTag";
    private RecipeBook myRecipeBook = RecipeBook.getInstance();

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
        preferences = mContext.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE);
    }

    public int getCount() {
        return myRecipeBook.getRecipes().length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setTransitionName("TransitionPhoto");
            imageView.setLayoutParams(new GridView.LayoutParams(GridView.AUTO_FIT, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(1, 1, 1, 1);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(myRecipeBook.getRecipe(position).getImageId());

//        String imageName = imageView.getResources().getResourceName(mThumbIds[position]);
//        String[] food = imageName.split("/");
//        Log.d(LOG_TAG, food[1]);
//
//        SharedPreferences.Editor editor = preferences.edit();
//        if(!preferences.contains(food[1])) {
//            editor.putString(food[1], food[1]);
//            editor.apply();
//        }

        return imageView;
    }

}
