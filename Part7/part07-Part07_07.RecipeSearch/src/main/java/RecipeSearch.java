
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class RecipeSearch {

    public static void main(String[] args) {
        
        // ask for user input for filename
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String fileName = scanner.nextLine();
        RecipeReader Reader = new RecipeReader(fileName);
        
        Reader.readRecipes();
        ArrayList<Recipe> recipes = Reader.separateRecipes();
        while (true){
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipe by name");
            System.out.println("find ingredient - searches recipe by ingredient");
            String command = scanner.nextLine();
            if (command.equals("list")){
                for (Recipe recipe: recipes){
                System.out.println(recipe.toString());
                }
            }
            if (command.equals("find name")){
                System.out.println("Searched word");
                String search = scanner.nextLine();
                ArrayList<Recipe> foundRecipes = Reader.returnRecipe(search);
                for (Recipe recipe: foundRecipes){
                    System.out.println(recipe);
                }
            }
            if (command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int maxCookTime = Integer.valueOf(scanner.nextLine());
                ArrayList<Recipe> foundRecipes = Reader.searchByTime(maxCookTime);
                for (Recipe recipe: foundRecipes){
                    System.out.println(recipe);
                }
            }
            if (command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                ArrayList<Recipe> foundRecipes = Reader.searchByIngredient(ingredient);
                for (Recipe recipe: foundRecipes){
                    System.out.println(recipe.toString());
                }
            }
            if (command.equals("stop")){
                break;
            }
        }

        // ask user for command
        // provide functionality for listing all recipes (names and cooktimes)
        
        
    }
}
