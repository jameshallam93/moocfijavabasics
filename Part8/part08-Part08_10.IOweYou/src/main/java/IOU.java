/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author james
 */
public class IOU {
    private HashMap<String, Double> owings;
    
    public IOU(){
        this.owings = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.owings.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return this.owings.getOrDefault(toWhom, 0.0);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.owings);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final IOU other = (IOU) obj;
        if (!Objects.equals(this.owings, other.owings)) {
            return false;
        }
        return true;
    }
    
}
