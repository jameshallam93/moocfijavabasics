
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManager manager = new GradeManager();
        
        UserInterface UI = new UserInterface(scanner, manager);
        
        UI.start();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
