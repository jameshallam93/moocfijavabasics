/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory change;


    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity); 
        this.change = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        change.add(super.getBalance());

    }
    @Override
    public double takeFromWarehouse(double amount){
        double returnedAmount = super.takeFromWarehouse(amount);
        change.add(super.getBalance());
        return returnedAmount;
    }
    public String history(){
        return this.change.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " +super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + change.maxValue());
        System.out.println("Smallest amount of product: " + change.minValue());
        System.out.println("Average: " + change.average());
    }
    
    
}
