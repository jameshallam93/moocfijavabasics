
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics sumOfUserInputs = new Statistics();
        Statistics sumOfEvenNumbers = new Statistics();
        Statistics sumOfOddNumbers = new Statistics();
        System.out.println("Enter numbers:");
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1){
                break;
            }
            sumOfUserInputs.addNumber(number);
            if (number % 2 == 0){
                sumOfEvenNumbers.addNumber(number);
            }
            if (number % 2 == 1){
                sumOfOddNumbers.addNumber(number);
            }
            
            
        }
        int sum = sumOfUserInputs.sum();
        System.out.println("Sum " + sum);
        
        int sumOfEven = sumOfEvenNumbers.sum();
        System.out.println("Sum of even numbers: " + sumOfEven);
        
        int sumOfOdd = sumOfOddNumbers.sum();
        System.out.println("Sum of odd numbers: " + sumOfOdd);
        
    }
    
    
}
