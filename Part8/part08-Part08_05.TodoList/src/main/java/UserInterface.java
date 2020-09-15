/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author james
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    public void start(){
        while (true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("add")){
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                list.add(toAdd);
                
            }
            if (command.equals("list")){
                list.print();
            }
            if (command.equals("remove")){
                System.out.println("Which one is removed?");
                int number = Integer.valueOf(scanner.nextLine());
                list.remove(number);
            }
            if (command.equals("stop")){
                break;
            }
        }
    }
    
}
