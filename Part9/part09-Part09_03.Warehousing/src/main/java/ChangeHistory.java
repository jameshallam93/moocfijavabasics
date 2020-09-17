/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author james
 */
public class ChangeHistory {
    
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory(){
        this.changeHistory = new ArrayList<>();
    }
    
    public void add(double status){
        this.changeHistory.add(status);
    }
    
    public void clear(){
        this.changeHistory.clear();
    }
    
    public String toString(){
        return this.changeHistory.toString();
    }
    
    public double maxValue(){
        double max = 0;
        for (double value: changeHistory){
            if (value > max){
                max = value;
            }
        }
        return max;        
    }
    
    public double minValue(){
        double min = changeHistory.get(0);
        for (double value: changeHistory){
            if (value < min){
                min = value;
            }
        }
        if (changeHistory.isEmpty()){
            min = 0;
        }
        return min;
    }
    
    public double average(){
        if (changeHistory.isEmpty()){
            return 0;
        }
        int count = changeHistory.size();
        double sum = 0;
        for (double value: changeHistory){
            sum = sum + value;
        }
        double average = (1.0 * sum)/ count;
        return average;
    }
}
