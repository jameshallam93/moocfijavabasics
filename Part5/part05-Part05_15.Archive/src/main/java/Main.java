
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        while (true){
            System.out.println("Identifier? (Empty will stop)");
            String ident = scanner.nextLine();
            if (ident.isEmpty()){
                break;
            }
            System.out.println("Name? (Empty will stop");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            Item newItem = new Item(ident, name);
            
            if (items.contains(newItem)){
                continue;

            }
            items.add(newItem);
            
            
            
        }
        System.out.println("==Items==");
        for (Item item: items){
            System.out.println(item.getIdent() + ": " + item.getName());
        }

    }
}
