/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Mushroom
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start(){
        String command = "";
        while (!(command.equals("end") || command.equals("loppu"))){
            System.out.println("Command:");
            command = scanner.nextLine();
            if (command.equals("end")){
                System.out.println("Bye bye!");
                continue;
            }
            if (command.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                
                this.dict.add(word, translation);
                continue;
            }
            if (command.equals("search")){
                System.out.println("To be translated:");
                String search = scanner.nextLine();

                
                if (!(this.dict.translate(search).equals(null))){
                    System.out.println(this.dict.translate(search));
                    continue;
                }
                System.out.println("Word " + search + " was not found.");
                continue;              
            }
            System.out.println("Unknown command");
            continue;
        }
    }
    

    
}
