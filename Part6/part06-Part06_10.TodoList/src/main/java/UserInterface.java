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
public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }
    public void start(){
        while (true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
            if (command.equals("add")){
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                this.todo.add(toAdd);
                continue;
            }
            if (command.equals("list")){
                todo.print();
            }
            if (command.equals("remove")){
                System.out.println("Which one is removed?");
                int removeIndex = (Integer.valueOf(scanner.nextLine()));
                todo.remove(removeIndex);
            }
        }
    }
    
    
}
