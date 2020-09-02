
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        divisibleByThreeInRange(3, 20);

    }
    public static void divisibleByThreeInRange(int beginning, int end){
        
        while (beginning != end +1){
            if (beginning % 3 == 0){
                System.out.println(beginning);
            }
            beginning += 1;
        }
    }

}
