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
public class TodoList {
     
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }
    public void add(String task){
        this.list.add(task);
    }
    public void print(){
        int index = 1;
        for (String task: list){
            System.out.println(index + ": " + task);
            index++;
        }
    }
    public void remove(int number){
        int index = number - 1;
        list.remove(index);
    }
    
}
