
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;
        while (running){
            String phrase = scanner.nextLine();
            if (phrase.equals("")){
                running = false;
            }else {
                String[] parts = phrase.split(" ");
                int index = 0;
                while (index < parts.length){
                    System.out.println(parts[index]);
                    index++;
                }
            }           
        }
    }
}
