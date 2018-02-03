package com.example.manny.wolfieeats.Objects;

/**
 * Created by Manny on 2/3/18.
 */

public class Food {
    private String name;
    private double calories;
    private double caloriesFromFat;
    private double cholesterol;
    private double dietaryFiber;
    private double protein;
    private double saturatedFat;
    private double sodium;
    private double sugars;
    private double totalCarbs;
    private double totalFat;
    private double transFat;

    public Food() {
        this.name = "";
        this.calories = 0;
        this.caloriesFromFat = 0;
        this.cholesterol = 0;
        this.dietaryFiber = 0;
        this.protein = 0;
        this.saturatedFat = 0;
        this.sodium = 0;
        this.sugars = 0;
        this.totalCarbs = 0;
        this.totalFat = 0;
        this.transFat = 0;
    }

    public Food(String name, double calories, double caloriesFromFat, double cholesterol, double dietaryFiber, double protein, double saturatedFat, double sodium, double sugars, double totalCarbs, double totalFat, double transFat) {
        this.name = name;
        this.calories = calories;
        this.caloriesFromFat = caloriesFromFat;
        this.cholesterol = cholesterol;
        this.dietaryFiber = dietaryFiber;
        this.protein = protein;
        this.saturatedFat = saturatedFat;
        this.sodium = sodium;
        this.sugars = sugars;
        this.totalCarbs = totalCarbs;
        this.totalFat = totalFat;
        this.transFat = transFat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCaloriesFromFat() {
        return caloriesFromFat;
    }

    public void setCaloriesFromFat(double caloriesFromFat) {
        this.caloriesFromFat = caloriesFromFat;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(double dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(double saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getSugars() {
        return sugars;
    }

    public void setSugars(double sugars) {
        this.sugars = sugars;
    }

    public double getTotalCarbs() {
        return totalCarbs;
    }

    public void setTotalCarbs(double totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(double totalFat) {
        this.totalFat = totalFat;
    }

    public double getTransFat() {
        return transFat;
    }

    public void setTransFat(double transFat) {
        this.transFat = transFat;
    }



}

/*

    Calories:0
    Calories from Fat:0
    Cholesterol:0
    Dietary Fiber:0
    Protein:0
    Saturated Fat:0
    Sodium:0
    Sugars:0
    Total Carbohydrates:0
    Total Fat:0
    Trans Fat:0

 */