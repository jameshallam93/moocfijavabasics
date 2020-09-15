
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();


        while (true) {
            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int quantity = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                container1.add(quantity);
            }
            if (command.equals("remove")){
                container2.remove(quantity);
                
            }
            if (command.equals("move")){
                if (container1.contains() - quantity > container1.min()){
                    container1.remove(quantity);
                    container2.add(quantity);
                    
                }else {
                    container2.add(container1.contains());
                    container1.remove(container1.contains());
                    
                }

            }

        }
    }

}
