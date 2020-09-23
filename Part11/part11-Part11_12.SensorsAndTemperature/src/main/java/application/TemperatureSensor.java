/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;
/**
 *
 * @author james
 */
public class TemperatureSensor implements Sensor {
    
    private String status;

    public TemperatureSensor() {
        this.status = "off";
    }
    
    public boolean isOn(){
        if (this.status.equals("on")){
            return true;
        }
        return false;
    }
    
    public void setOn(){
        this.status = "on";
    }
    public void setOff(){
        this.status = "off";
    }
    
    public int read(){
        if (this.status.equals("off")){
            throw new IllegalStateException("Sensor is currently off");
        }
        Random random = new Random();
        int randomInt = random.nextInt(61);
        int returnInt = randomInt - 30;
        return returnInt;
    }
    
    
    
    
    
}
