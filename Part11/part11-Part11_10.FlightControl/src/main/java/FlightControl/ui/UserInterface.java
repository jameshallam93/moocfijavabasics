/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;
import java.util.Scanner;
import FlightControl.logic.FlightControl;
/**
 *
 * @author james
 */
public class UserInterface {
    private Scanner scanner;
    private FlightControl control;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.control = new FlightControl();
    }
    
    public void startAssetControl(){
        System.out.println("Airport Asset Control");
        while (true){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            String input = scanner.nextLine();
            if (input.equals("x")){
                break;
            }
            if (input.equals("1")){
                addAirplane();
            }
            if (input.equals("2")){
                addFlight();
            }
        }
    }
    public void startFlightControl(){
        System.out.println("Flight Control");
        while (true){
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            
            String input = scanner.nextLine();
            if (input.equals("x")){
                break;
            }
            if (input.equals("1")){
                control.printAirplanes();
            }
            if (input.equals("2")){
                control.printFlights();
            }
            if (input.equals("3")){
                System.out.println("Give the airplane id:");
                String id = askForPlane();
                control.printPlaneInfo(id);
                
            }
        }
    }
    public void addAirplane(){
        System.out.println("Give the airplane id:");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        int capacity = Integer.valueOf(scanner.nextLine());
        this.control.addPlane(id, capacity);
    }
    public void addFlight(){
        System.out.println("Give the airplane id:");
        String id = askForPlane();
        System.out.println("Give the departure airport id:");
        String depID = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String arrID = scanner.nextLine();
        this.control.addFlight(id, depID, arrID);
        
    }
    public String askForPlane(){
        while (true){
            String id = scanner.nextLine();
            if (control.getPlanes().contains(id)){
                return id;
            }
            System.out.println("No airplane with the id " + id +".");
        }
    }
    
    
}
