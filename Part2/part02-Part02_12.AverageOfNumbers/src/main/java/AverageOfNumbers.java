
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumbers = 0;
        int numbers = 0;
        double average = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            }
            numbers = numbers + 1;
            sumbers = sumbers + number;
        }
        average = 1.0 * sumbers / numbers;
        System.out.println("Average of the numbers: " + average);
        

    }
}
