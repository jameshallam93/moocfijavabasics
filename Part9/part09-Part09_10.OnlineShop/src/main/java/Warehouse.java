/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author james
 */
public class Warehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }
    public int price(String product){
        if (!(prices.containsKey(product))){
            return -99;
        }
        int price = prices.get(product);
        return price;
    }
    public int stock(String product){
        if (!(this.stock.containsKey(product))){
            return 0;
        }
        int stock = this.stock.get(product);
        return stock;
    }
    public boolean take(String product){
        if (!(this.stock.containsKey(product))){
            return false;
        }
        if (this.stock.get(product) > 0){
            this.stock.replace(product,this.stock.get(product) - 1);
            return true;
        }
        return false;
    }
    public Set<String> products(){
        Set<String> products = new HashSet<>();
        
        for (String product: this.stock.keySet()){
            products.add(product);
        }
        return products;
    }
    
}
