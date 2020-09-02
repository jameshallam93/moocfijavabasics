
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int value1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(scanner.nextLine());
        
        int plus = (value1 + value2);
        int minus = (value1 - value2);
        int times = (value1 * value2);
        double divide = (1.0 * value1 / value2);
        
        System.out.println(value1 + " + " + value2 + " = " + plus);
        System.out.println(value1 + " - " + value2 + " = " + minus);
        System.out.println(value1 + " * " + value2 + " = " + times);
        System.out.println(value1 + " / " + value2 + " = " + divide);
        
        

    }
}
