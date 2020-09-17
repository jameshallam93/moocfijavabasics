/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author james
 */
public class Store {
    
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }
    public void shop(String customer){
        
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("Our selection:");
        
        
        for (String product: this.warehouse.products()){
            System.out.println(product);
            
        }
        
        while (true){
            System.out.println("What to put in the cart (press enter to go to the register):");
            String product = scanner.nextLine();
            if (product.isEmpty()){
                break;
            }
            
            if (this.warehouse.products().contains(product)){
                cart.add(product, this.warehouse.price(product));
                this.warehouse.take(product);

            }
        }
        System.out.println("Your shopping cart contains:");
        cart.print();
        System.out.println("total: " + cart.price());
        
    }
    
}
