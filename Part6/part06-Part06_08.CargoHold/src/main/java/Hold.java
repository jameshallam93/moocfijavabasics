/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Mushroom
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> list;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
        
    }
    public void addSuitcase(Suitcase suitcase){
        int totalWeight = 0;
        for (Suitcase suit: list){
            totalWeight = totalWeight + suit.totalWeight();
        }
        if (!(totalWeight + suitcase.totalWeight() > this.maxWeight)){
            this.list.add(suitcase);
        }
    }
    public String toString(){
        int noItems = list.size();
        int totalWeight = 0;
        for (Suitcase suit: list){
            totalWeight = totalWeight + suit.totalWeight();
        }
        return noItems + " suitcases (" + totalWeight + " kg)";
        
    }
    public void printItems(){
        System.out.println("The suitcases in the hold contain the following items:");
        String items = "";
        for (Suitcase suit: list){
            suit.printItems();
        }
    }
}
