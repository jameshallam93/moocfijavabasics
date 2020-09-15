
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
            
            String[] commandElements = input.split(" ");
            String command = commandElements[0];
            int amount = Integer.valueOf(commandElements[1]);
            
            if (command.equals("add")){
                container1.add(amount);
            }
            if (command.equals("remove")){
                container2.remove(amount);
            }
            if (command.equals("move")){
                if (container1.contains() < amount){
                    amount = container1.contains();
                }
                container1.remove(amount);
                container2.add(amount);
            }
            

        }
    }

}
