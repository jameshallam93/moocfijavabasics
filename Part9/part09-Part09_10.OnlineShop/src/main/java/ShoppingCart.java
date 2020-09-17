/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author james
 */
public class ShoppingCart {
    private Map<String, Item> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }
    public void add(String productName, int price){
        if (!(this.products.containsKey(productName))){
            this.products.put(productName, new Item(productName, 1, price));
            return;
        }
        for (String product: products.keySet()){
            if (product.equals(productName)){
                this.products.get(product).increaseQuantity();;
            }
            
        }
        
        
        
        
    }
    public int price(){
        int totalPrice = 0;
        for (Item item: this.products.values()){
            int itemPrice = item.price();
            totalPrice = totalPrice + itemPrice;
        }
        return totalPrice;
    }
    public void print(){
        for (String product: this.products.keySet()){
            System.out.println(product + ": " + products.get(product).quantity());
        }
    }
    
    
    
    
    
}
