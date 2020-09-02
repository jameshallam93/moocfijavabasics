
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        String pass = "Caput Draconis";
        System.out.println("Password?");
        String guess =scan.nextLine();
        if (guess.equals(pass)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
