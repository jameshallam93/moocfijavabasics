/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.domain.Plane;
import java.util.*;
/**
 *
 * @author james
 */
public class FlightControl {
    private HashMap<String, Place> places;
    private HashMap<String, Plane> planes;
    private HashMap<String, Flight> flights;

    public FlightControl() {
        this.places = new HashMap<>();
        this.planes = new HashMap<>();
        this.flights = new HashMap<>();
    }
    
    public void addPlace(String place){
        places.put(place, new Place(place));
    }
    public void addPlane(String plane, int capacity){
        planes.put(plane, new Plane(plane, capacity));
    }
    public void addFlight(String plane, String depart, String arrive){
        places.putIfAbsent(depart, new Place(depart));
        places.putIfAbsent(arrive, new Place(arrive));
        
        Flight flight = new Flight(planes.get(plane), places.get(depart), places.get(arrive));
        flights.put(flight.toString(), flight);
    }
    public List<String> getPlanes(){
        ArrayList<String> returnedPlanes = new ArrayList<>();
        for (String planes: this.planes.keySet()){
            returnedPlanes.add(planes);
        }
        return returnedPlanes;
    }
    public void printAirplanes(){
        for (Plane plane: this.planes.values()){
            System.out.println(plane.toString());
            
        }
    }
    public void printFlights(){
        for (Flight flight: this.flights.values()){
            System.out.println(flight.toString());
        }
    }
    public void printPlaneInfo(String id){
        for (String plane: this.planes.keySet()){
            if (plane.equals(id)){
                System.out.println(this.planes.get(id).toString());
            }
        }
    }
   
}
