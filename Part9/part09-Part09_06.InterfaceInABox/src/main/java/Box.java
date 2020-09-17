/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author james
 */
public class Box implements Packable{
    private double maxWeight;
    private ArrayList<Packable> listOfItems;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.listOfItems = new ArrayList<>();
    }
    
    public void add(Packable packable){
        if (weight() + packable.weight() > this.maxWeight){
            return;
        }
        listOfItems.add(packable);
    }
    public double weight(){
        double weight = 0;
        for (Packable item: listOfItems){
            weight = weight + item.weight();
        }
        return weight;
    }
    @Override
    public String toString(){
        return "Box: " + listOfItems.size() + " items"  +", total weight " + weight() +" kg";
    }
    
}
