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
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        super();
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    public int getWeight(ArrayList<Item> items){
        int weight = 0;
        for (Item item: items){
            weight = weight + item.getWeight();
        }
        return weight;
    }    
    
    @Override
    public void add(Item item){
        if (this.isInBox(item)){
            return;
        }
        if (item.getWeight() + getWeight(items) > this.capacity){
            return;
        }
        items.add(item);
        
    }
    @Override
    public boolean isInBox(Item item){
        if (this.items.contains(item)){
            return true;
        }
        return false;
    }
}
