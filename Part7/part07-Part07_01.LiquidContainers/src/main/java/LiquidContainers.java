
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int maxLiquid = 100;
        int minLiquid = 0;
        int container1Liquid = 0;
        int container2Liquid = 0;
        
            
        

        while (true) {
            System.out.println("First: " + container1Liquid + "/100");
            System.out.println("Second: " +container2Liquid + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] commandElements = input.split(" ");
            String command = commandElements[0];
            int amount = Integer.valueOf(commandElements[1]);
            if (command.equals("add")){
                if (amount < 0){
                    continue;
                }
                if (container1Liquid + amount > 100){
                    container1Liquid = maxLiquid;
                    continue;
                }
                container1Liquid += amount;
                continue;
            }
            if (command.equals("move")){
                if (amount < 0){
                    continue;
                }
                
                if (amount > container1Liquid){
                    amount = container1Liquid;
                }
                if (container2Liquid + amount > maxLiquid){
                    container1Liquid -= amount;
                    container2Liquid = maxLiquid;
                    continue;
                }
                container1Liquid -= amount;
                container2Liquid += amount;
                
            }
            if (command.equals("remove")){
                if (container2Liquid - amount < minLiquid){
                    container2Liquid = minLiquid;
                    continue;
                }
                container2Liquid -= amount;
                
            }

        }
    }

}
