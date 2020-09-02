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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> itemList;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.itemList = new ArrayList<>();
    }
    
    public void addItem(Item item){
        int totalWeight = 0;
        for (Item items: itemList){
            totalWeight = totalWeight + items.getWeight();
        }
        if (!(totalWeight + item.getWeight() > maxWeight)){
            this.itemList.add(item);
        }
    }
    public String toString(){
        int noItems = itemList.size();
        int totalWeight = 0;
        for (Item items:itemList){
            totalWeight = totalWeight + items.getWeight();
        }
        String numberItems = Integer.toString(noItems);
        if (noItems == 0){
            numberItems = "no";
        }
        String s = "s";
        if (noItems == 1){
            s = "";
        }
        return numberItems + " item" + s + " (" + totalWeight + " kg)";
    }
    public void printItems(){
        for (Item items: itemList){
            System.out.println(items.getName() + " (" + items.getWeight() + "kg)");
            
        }        
    }
    public int totalWeight(){
        int totalWeight = 0;
        for (Item items: itemList){
            totalWeight = totalWeight + items.getWeight();
        }
        return totalWeight;
    }
    public Item heaviestItem(){
        if (this.itemList.isEmpty()){
            return null;
        }
        Item heaviest = itemList.get(0);
        for (Item items: itemList){
            if (items.getWeight() > heaviest.getWeight()){
                heaviest = items;
            }
        }
        return heaviest;
    }
}
