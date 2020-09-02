
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scan.nextLine();
        
        System.out.println("Give an integer:");
        int value = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double doub = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + doub);
        System.out.println("You gave the boolean " + bool);
        
         

    }
}
