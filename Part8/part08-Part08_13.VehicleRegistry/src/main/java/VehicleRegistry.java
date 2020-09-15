/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author james
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> database;

    public VehicleRegistry() {
        this.database = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner){
        if (database.containsKey(licensePlate)){
            return false;
        }
        database.put(licensePlate, owner);
        return true;
    }
    public String get(LicensePlate licensePlate){

        
        return database.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate){
        if (database.containsKey(licensePlate)){
            database.remove(licensePlate);
            return true;
        }
        return false;
    }
    public void printLicensePlates(){
        for (LicensePlate licensePlate: database.keySet()){
            System.out.println(licensePlate);
        }
    }
    public void printOwners(){
        ArrayList<String> printedOwners = new ArrayList<>();
        for (String owners: database.values()){
            if (!((printedOwners.contains(owners)))){
                System.out.println(owners);
                printedOwners.add(owners);
            }

        }
    }
    
    
}
