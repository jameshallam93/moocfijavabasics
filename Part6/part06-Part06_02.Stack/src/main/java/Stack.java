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
public class Stack {
    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return (this.list.isEmpty());
    }
    
    public void add(String value){
        list.add(value);
    }
    public ArrayList<String> values(){
        return this.list;
    }
    public String take(){
        int length = list.size() - 1;
        String topStack = list.get(length);
        list.remove(length);
        return topStack;
    }
}
