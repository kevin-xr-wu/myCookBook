package com.example.kevinwu.mycookbook;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodPage extends AppCompatActivity {

    private Toolbar toolbar;
    private Boolean favorite_pressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        toolbar = (Toolbar) findViewById(R.id.customToolbar);
        setSupportActionBar(toolbar);



        RecipeBook recipeBook = new RecipeBook();
        ImageView foodImage = (ImageView) findViewById(R.id.foodDisplay);
        TextView ingredientText = (TextView) findViewById(R.id.ingrediantDisplay);


        Bundle extras = getIntent().getExtras();

        int imageId = 0;
        if(extras != null) {
            imageId = extras.getInt(MainActivity.EXTRA_MESSAGE);
        }

        Recipe recipe = recipeBook.getRecipe(imageId);
        foodImage.setImageResource(recipe.getImageId());
        foodImage.setScaleType(ImageView.ScaleType.FIT_XY);
        ingredientText.setText(recipe.getRecipe());
        getSupportActionBar().setTitle(recipe.getfoodName());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id == R.id.action_favorite)
        {
            if(!favorite_pressed) {
                item.setIcon(getResources().getDrawable(R.drawable.ic_favorite_red_24dp));
                favorite_pressed = true;
            }
            else {
                item.setIcon(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                favorite_pressed = false;
            }
        }
        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }
}
