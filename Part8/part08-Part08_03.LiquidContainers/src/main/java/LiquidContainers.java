
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int container1 = 0;
        int container2 = 0;
        int maxLiquid = 100;


        while (true) {
            
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int quantity = Integer.valueOf(parts[1]);
            if (command.equals("add")){
                if (container1 + quantity > maxLiquid){
                    container1 = maxLiquid;
                    continue;
                }
                if (quantity > 0){
                    container1 = container1 + quantity;
                    continue;
                }
                
            }
            if (command.equals("move")){
                if (container1 - quantity < 0){
                    container2 = container2 + container1;
                    container1 = 0;
                }else{
                container1 = container1 - quantity;
                container2 = container2 + quantity;
                }
                
                if (container2 > maxLiquid){
                    container2 = maxLiquid;
                }
            }
            if (command.equals("remove")){
                container2 = container2 - quantity;
                if (container2 < 0){
                    container2 = 0;
                }
            }
                

                
            
        }
    }

}
