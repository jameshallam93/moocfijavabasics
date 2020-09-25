/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author james
 */
public class Employees {
    
    private ArrayList<Person> people;
    
    
    public Employees(){
        this.people = new ArrayList<>();
    }
    
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public void add(List<Person> people){
        this.people.addAll(people);
    }
    
    public void print(Education education){
        
        Iterator<Person> iterator = this.people.iterator();
        
        while (iterator.hasNext()){
            Person next = iterator.next();
            if (next.getEducation() == education){
                System.out.println(next.toString());

            }
        }
    }    
    
    
    public void print(){
        Iterator<Person> iterate = this.people.iterator();
        
        
        while (iterate.hasNext()){
            System.out.println(iterate.next().toString());
        }
    }
    
    public void fire(Education education){
        
        Iterator<Person> iterator = this.people.iterator();
        
        while (iterator.hasNext()){
            Person next = iterator.next();
            if (next.getEducation() == education){
                iterator.remove();
            }
        }
       
        
    }
    
}
