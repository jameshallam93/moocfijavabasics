/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author james
 */
public class Recipe {

    private String name;
    private int cookTime;
    private  String ingredients;
    
    public Recipe(String name, int cookTime, String ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }
    public String getName(){
        return this.name;
    }
    public int getTime(){
        return this.cookTime;
    }
    
    public String toString(){
        return this.name + ", cooking time: " + this.cookTime;
    }
    public String getIngredients(){
        System.out.println(this.ingredients);
        return this.ingredients;
    }
}    
    

