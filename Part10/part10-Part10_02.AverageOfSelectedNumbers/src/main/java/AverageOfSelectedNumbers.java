
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type 'end' to stop. ");
        ArrayList<String> numbers = new ArrayList<>();
        while (true){
            
        
       
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            numbers.add(input);
            
            
        }
        System.out.println("Print the average of the negeative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if (input.equals("n")){
            double averageOfNegative = numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s<0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: " + averageOfNegative);
                            
        }
        if (input.equals("p")){
            double averageOfPositives = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s>0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + averageOfPositives);
        }
    }
}
