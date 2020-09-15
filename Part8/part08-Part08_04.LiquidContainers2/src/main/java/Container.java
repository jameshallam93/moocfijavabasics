/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james
 */
public class Container {
    private int quantity;
    private final int maxLiquid = 100;
    private final int minLiquid = 0;

    public Container() {
        this.quantity = 0;
    }
    public int contains(){
        return this.quantity;
    }
    public int max(){
        return this.maxLiquid;
    }
    public int min(){
        return this.minLiquid;
    }
    public void add(int quantity){
        if (quantity > 0){
            this.quantity = this.quantity + quantity;
        }
        if (this.quantity > maxLiquid){
            this.quantity = maxLiquid;
        }
    }
    public void remove(int quantity){
        if (quantity > 0){
            this.quantity = this.quantity - quantity;
        }
        if (this.quantity < minLiquid){
            this.quantity = minLiquid;
        }
    }
    public String toString(){
        return this.quantity + "/100";
    }
    
}
