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
public class Flight {
    private Plane plane;
    private Place departureFrom;
    private Place arriveAt;

    public Flight(Plane plane, Place departureFrom, Place arriveAt) {
        this.plane = plane;
        this.departureFrom = departureFrom;
        this.arriveAt = arriveAt;
    }
    @Override
    public String toString(){
        return this.plane.toString() + " (" + this.departureFrom.toString() + "-" + this.arriveAt.toString() + ")";
    }    
}
