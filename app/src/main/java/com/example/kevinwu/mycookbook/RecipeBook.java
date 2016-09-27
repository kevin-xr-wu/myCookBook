package com.example.kevinwu.mycookbook;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Kevin on 9/24/2016.
 */
public class RecipeBook {

    private Recipe[] recipes = {
            new Recipe(R.drawable.cheesecake, "Velvet Cheesecake",
                    "Ingredients\n" +
                            "1 1/2 cups chocolate graham cracker crumbs\n" +
                            "1/4 cup butter, melted\n" +
                            "1 tablespoon granulated sugar\n" +
                            "3 (8-ounce) packages cream cheese, softened\n" +
                            "1 1/2 cups granulated sugar\n" +
                            "4 large eggs, lightly beaten\n" +
                            "3 tablespoons unsweetened cocoa\n" +
                            "1 cup sour cream\n" +
                            "1/2 cup whole buttermilk\n" +
                            "2 teaspoons vanilla extract\n" +
                            "1 teaspoon distilled white vinegar\n" +
                            "2 (1-ounce) bottles red food coloring\n" +
                            "1 (3-ounce) package cream cheese, softened\n" +
                            "1/4 cup butter, softened\n" +
                            "2 cups powdered sugar\n" +
                            "1 teaspoon vanilla extract\n" +
                            "Garnish: fresh mint sprigs\n" + "\n" +
                            "Directions\n" +
                            "Stir together graham cracker crumbs, melted butter, and 1 tablespoon granulated sugar; press mixture into bottom of a 9-inch springform pan.\n" +
                            "\n" +
                            "Beat 3 (8-ounce) packages cream cheese and 1 1/2 cups granulated sugar at medium-low speed with an electric mixer 1 minute. Add eggs and next 6 ingredients, mixing on low speed just until fully combined. Pour batter into prepared crust.\n" +
                            "\n" +
                            "Bake at 325° for 10 minutes; reduce heat to 300°, and bake for 1 hour and 15 minutes or until center is firm. Run knife along outer edge of cheesecake. Turn oven off. Let cheesecake stand in oven 30 minutes. Remove cheesecake from oven; cool in pan on a wire rack 30 minutes. Cover and chill 8 hours.\n" +
                            "\n" +
                            "Beat 1 (3-ounce) package cream cheese and 1/4 cup butter at medium speed with an electric mixer until smooth; gradually add powdered sugar and vanilla, beating until smooth. Spread evenly over top of cheesecake. Remove sides of springform pan. Garnish, if desired."
            ),
            new Recipe(R.drawable.cheesesticks, "Homemade Cheesesticks",
                    "Ingredients\n" +
                            "1⁄4 cup flour\n" +
                            "1 cup Italian style breadcrumbs\n" +
                            "2 eggs\n" +
                            "1 tablespoon milk\n" +
                            "1 lb mozzarella cheese, cut into 3/4 inch x 3/4 inch strips (or you can use string cheese and cut each in half)\n" +
                            "1 cup vegetable oil\n" +
                            "1 cup jarred pizza sauce or 1 cup marinara sauce\n" + "\n" +
                            "Directions\n" +
                            "Whisk eggs and milk together.\n" +
                            "Coat each piece of cheese with flour, then dip in egg and then roll in bread crumbs.\n" +
                            "Dip in egg and crumbs again.\n" +
                            "Heat oil in skillet and cook sticks for about a minute on each side, or until golden and before cheese starts to leak.\n" +
                            "Drain on paper towels.\n" +
                            "Serve with sauce for dipping."
            ),
            new Recipe(R.drawable.chocolatecake, "Chocolate Mousse Cake",
                    "Ingredients\n" +
                            "1 (18.25 ounce) package chocolate cake mix \n" +
                            "1 (14 ounce) can sweetened condensed milk \n" +
                            "2 (1 ounce) squares unsweetened chocolate, melted\n" +
                            "1/2 cup cold water \n" +
                            "1 (3.9 ounce) package instant chocolate pudding mix\n" +
                            "1 cup heavy cream, whipped\n" + "\n" +
                            "Directions\n" +
                            "Preheat oven to 350 degrees F (175 degrees C). Prepare and bake cake mix according to package directions for two 9-inch layers. Cool and remove from pans.\n" +
                            "In a large bowl, mix together sweetened condensed milk and melted chocolate. Gradually stir in the water, then instant pudding until smooth. Chill for at least 30 minutes.\n" +
                            "Remove the chocolate mixture from the refrigerator, and stir to loosen. Fold in whipped cream and return to the refrigerator for at least another hour.\n" +
                            "Place one layer of cake onto a serving plate. Top with 1 1/2 cups of the mousse, then cover with the remaining cake layer. Frost with the remaining mousse, and refrigerate until serving. Garnish with fresh fruit or chocolate shavings."
            ),
            new Recipe(R.drawable.cinnabons, "Sugarless Cinnabons",
                    "Ingredients\n" +
                            "1 (1/4 ounce) package dry yeast\n" +
                            "1 cup warm milk\n" +
                            "1⁄2 cup granulated sugar\n" +
                            "1⁄3 cup margarine\n" +
                            "1 teaspoon salt\n" +
                            "2 eggs\n" +
                            "4 cups flour\n" + "\n" +
                            "Directions\n" +
                            "For the rolls, dissolve the yeast in the warm milk in a large bowl.\n" +
                            "Add sugar, margarine salt, eggs, and flour, mix well.\n" +
                            "Knead the dough into a large ball, using your hands dusted lightly with flour.\n" +
                            "Put in a bowl, cover and let rise in a warm place about 1 hour or until the dough has doubled in size.\n" +
                            "Roll the dough out on a lightly floured surface, until it is approx 21 inches long by 16 inches wide.\n" +
                            "It should be approx 1/4 thick.\n" +
                            "Preheat oven to 400 degrees.\n" +
                            "To make filling, combine the brown sugar and cinnamon in a bowl.\n" +
                            "Spread the softened margarine over the surface of the dough, then sprinkle the brown sugar and cinnamon evenly over the surface.\n" +
                            "Working carefully, from the long edge, roll the dough down to the bottom edge.\n" +
                            "Cut the dough into 1 3/4 inch slices, and place in a lightly greased baking pan.\n" +
                            "Bake for 10 minutes or until light golden brown.\n" +
                            "While the rolls are baking combine the icing ingredients.\n" +
                            "Beat well with an electric mixer until fluffy.\n" +
                            "When the rolls are done, spread generously with icing."
            ),
            new Recipe(R.drawable.dragonsushi, "Dragonroll", "sushi and stuff"),
            new Recipe(R.drawable.eggroll, "Southeastern Chinese Eggrolls", "Egg and Roll"),
            new Recipe(R.drawable.indianfood, "Authentic Indian Food", "Indian and food"),
            new Recipe(R.drawable.kungpao, "General Tso's Chicken", "Kung and pao"),
            new Recipe(R.drawable.logcake, "Winter Holiday Logcake", "log and cake"),
            new Recipe(R.drawable.pizza, "Spicy Barbeque Pizza", "pizza and cheese"),
            new Recipe(R.drawable.sliders, "Homemade Sliders", "buns and meat"),
            new Recipe(R.drawable.spicytuna, "Spicy Tuna Roll", "spicy and tuna"),
            new Recipe(R.drawable.steak, "Seared Steak", "meat and oil"),
            new Recipe(R.drawable.stirfry, "Chinese Stirfry Noodles", "noodles and vegies"),
            new Recipe(R.drawable.sushi, "California Roll", "su and shi"),
            new Recipe(R.drawable.pretzel, "Auntie Anne's Famous Pretzel", "bread and flavor"),
    };

    private ArrayList<Recipe> recipeList;
    private static RecipeBook instance = null;

    public RecipeBook() {
        populateBook();
    }

    public static RecipeBook getInstance() {
        if (instance == null) {
            instance = new RecipeBook();
        }
        return instance;
    }

    public Recipe getRecipe(int position) {
        return recipeList.get(position);
    }

    public Recipe[] getRecipes() {
        return recipes;
    }

    void populateBook() {
        recipeList = new ArrayList<>();
        Collections.addAll(recipeList, recipes);
    }
}
