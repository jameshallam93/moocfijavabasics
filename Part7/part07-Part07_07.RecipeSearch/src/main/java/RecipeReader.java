/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
/**
 *
 * @author james
 */
public class RecipeReader {

    private String fileName;
    private ArrayList<String> lines;
    private ArrayList<Recipe> recipes;

    public RecipeReader(String fileName) {

        this.fileName = fileName;
        this.lines = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }
    public void readRecipes(){
        try (Scanner reader = new Scanner(Paths.get(this.fileName))){
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                lines.add(line);
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public ArrayList<Recipe> separateRecipes(){
        int index = 0;
        int startIndex = 0;
        String name = "";
        int time = 0;
        String ingredients = "";
        for (String line: lines){
            if (index == startIndex){
                name = line;
                index++;
                continue;
            }
            else if (index == startIndex + 1){
                time = Integer.valueOf(line);
                index++;
                continue;
            }
            else{
                if (!(line.isEmpty())){
                    ingredients = ingredients + line + ",";
                }
            }
            if (line.isEmpty() || (index + recipes.size() + 1 == lines.size())){
                Recipe recipe = new Recipe(name, time, ingredients);
                recipes.add(recipe);
                System.out.println(index);
                startIndex = index;
                System.out.println(ingredients);
                ingredients = "";
                continue;
            }
            index++;

        }
        System.out.println(lines.size());
        System.out.println(index);
        return recipes;
    }
    public ArrayList<Recipe> returnRecipe(String searched){
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        for (Recipe recipe: recipes){
            String name = recipe.getName();
            String[] nameParts = name.split(" ");
            for (String string: nameParts){
                if (string.contains(searched)){
                    foundRecipes.add(recipe);
                }

            
         }
        }
        return foundRecipes;
    }
    public ArrayList<Recipe> searchByTime(int time){
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        for (Recipe recipe: recipes){
            if (recipe.getTime() <= time){
                foundRecipes.add(recipe);
            }
        }
        return foundRecipes;
    }
    public ArrayList<Recipe> searchByIngredient(String searchedIngredient){
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        for (Recipe recipe: recipes){
            String ingredients = recipe.getIngredients();
            String[] splitIngredients = ingredients.split(",");
            for (String ingredient: splitIngredients){
                if (ingredient.equals(searchedIngredient)){
                    foundRecipes.add(recipe);
                }
            

            }
            
            }
        return foundRecipes;
    }

}
