/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author james
 */
public class Herd implements Movable{
    
    private ArrayList<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    @Override
    public String toString(){
        String returnString = "";
        for (Movable organism: herd){
            returnString = returnString + organism.toString() + "\n";
        }
        return returnString;
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    @Override
    public void move(int dx, int dy){
        for (Movable organism: this.herd){
            organism.move(dx, dy);
            
        }

    }
    
}
