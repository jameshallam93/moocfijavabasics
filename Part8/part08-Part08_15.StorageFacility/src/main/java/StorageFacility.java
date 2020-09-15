/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author james
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;
    
    public StorageFacility(){
        this.facility = new HashMap<>();
    }
    public void add(String unit, String item){
        this.facility.putIfAbsent(unit,new ArrayList<>());
        this.facility.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit){
        ArrayList<String> contents = new ArrayList<>();
        if (!(this.facility.containsKey(unit))){
            return contents;
        }
        if (this.facility.get(unit).isEmpty()){
            return contents;
        }
        contents = this.facility.get(unit);
        return contents;
    }
    public void remove(String storageUnit, String item){
        if (facility.containsKey(storageUnit)
                && facility.get(storageUnit).contains(item)){
            facility.get(storageUnit).remove(item);
        }
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> returnedUnits = new ArrayList<>();
        for (String unit: facility.keySet()){
            if (facility.get(unit).isEmpty()){
                continue;
            }
            returnedUnits.add(unit);
        }
        return returnedUnits;
    }
}
