
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int value1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(scanner.nextLine());
        
        int value3 = (value1 + value2);
        
        System.out.println(value1 + " + " + value2 + " = " + value3);

    }
}
