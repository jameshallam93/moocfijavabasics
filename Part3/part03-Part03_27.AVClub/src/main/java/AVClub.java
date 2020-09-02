
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running){
            String phrase = scanner.nextLine();
            if (phrase.equals("")){
                running = false;
            }else{                
                String[] parts = phrase.split(" ");
                for (int i = 0; i < parts.length; i++){
                    if (parts[i].contains("av")){
                        System.out.println(parts[i]);
                    }
            }
                
            }
        }


    }
}
