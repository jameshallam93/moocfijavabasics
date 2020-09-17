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
public class OneItemBox extends Box{
    
    private int capacity;
    private ArrayList<Item> item;
    
    public OneItemBox(){
        super();
        this.capacity = 1;
        this.item = new ArrayList<>();
        
    }
    
    @Override
    public void add(Item item){
        if (this.item.isEmpty()){
            this.item.add(item);
        }
    }
    @Override
    public boolean isInBox(Item item){
        if (this.item.contains(item)){
            return true;
        }
        return false;
    }
}
