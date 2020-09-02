
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String longestName = " ";
        int sum = 0;
        int count = 0;
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] parts = input.split(",");
            String name = parts[0];
            int year = Integer.valueOf(parts[1]);
            if (name.length() > longest){
                longest = name.length();
                longestName = name;
            }
            sum = sum + year;
            count++;
        }
        double average = (1.0 * sum) / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
        


    }
}
