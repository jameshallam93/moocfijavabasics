/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author james
 */
public class Place {
    private String placeID;
    
    public Place(String ID){
        this.placeID = ID;
    }
    
    public String toString(){
        return this.placeID;
    }
}
