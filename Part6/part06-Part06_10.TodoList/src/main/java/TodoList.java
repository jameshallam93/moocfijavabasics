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
public class TodoList{
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    public void add(String task){
        this.list.add(task);
    }
    public void print(){
        for (String task: list){
            int number = list.indexOf(task) + 1;
            System.out.println(number + ": " + task);

        }

    }
    public void remove(int number){
        int index = number-1;
        this.list.remove(index);
    }

}
