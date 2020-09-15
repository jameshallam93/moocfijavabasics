/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james
 */
public class Bird {
    private String name;
    private String latinName;
    private int sightings;
    
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.sightings = 0;
    }
    
    public void addSighting(){
        this.sightings++;
    }
    public String getName(){
        return this.name;
        
    }
    public String getLatinName(){
        return this.latinName;
        
    }
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.sightings + " observations";
    }
    
}
