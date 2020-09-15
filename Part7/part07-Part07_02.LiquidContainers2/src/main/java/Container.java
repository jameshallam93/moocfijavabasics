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
    private int amount;
    private static int maxLiquid = 100;
    private static int minLiquid = 0;
    
    public Container(){
        this.amount = 0;
    }
    public int contains(){
        return this.amount;
    }
    public void add(int amount){
        if (this.amount + amount > maxLiquid){
            this.amount = maxLiquid;
        }
        else if (amount < 0){
            this.amount = this.amount + 0;
        }else{
            this.amount = this.amount + amount;
        }
    }
    public void remove(int amount){
        if (amount < 0){
            amount = 0;
        }
        if (this.amount - amount < minLiquid){
            amount = this.amount;
        }
        this.amount = this.amount - amount;
    }
    public String toString(){
        return this.amount + "/100";
    }
    
    
}
