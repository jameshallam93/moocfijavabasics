
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dict = new SimpleDictionary();
        TextUI text = new TextUI(scanner, dict);
        
        text.start();
        
    }
}
