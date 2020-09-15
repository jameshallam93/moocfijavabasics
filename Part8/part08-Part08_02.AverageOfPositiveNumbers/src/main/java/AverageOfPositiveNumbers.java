
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true){
            int inputValue = Integer.valueOf(scanner.nextLine());
            if (inputValue == 0){
                break;
                
            }
            if (inputValue > 0){
                count++;
                sum = sum + inputValue;
            }
            
        }
        if (count == 0){
            System.out.println("Cannot calculate the average");
        }else{
            double average = (1.0 * sum) / count;
            System.out.println(average);
        }
        
        

        
    }


}

