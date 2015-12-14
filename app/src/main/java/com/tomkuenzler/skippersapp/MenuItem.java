package com.tomkuenzler.skippersapp;

/**
 * Created by Tom on 11/24/2015.
 */
public class MenuItem {
    private String item;
    private String ingredients;
    private String instructions;

    public String getItem() {
        return item;
    }
    public String getIngredients() {
        return ingredients;
    }
    public String getInstructions() {
        return instructions;
    }

    public void setItem(String item) {
        this.item = item;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
