
import java.util.Scanner;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager manager = new BookManager();

        
        UserInterface UI = new UserInterface(scanner, manager);
        
        UI.start();

    }

}
