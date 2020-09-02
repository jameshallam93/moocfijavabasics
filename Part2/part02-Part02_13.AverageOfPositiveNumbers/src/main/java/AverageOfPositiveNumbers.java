
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            if (number > 0) {
                numbers = numbers + 1;
                sumbers = sumbers + number;
            }
            
        }
        if (numbers > 0){
            average = 1.0 * sumbers / numbers;
            System.out.println("Average of the numbers: " + average);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
