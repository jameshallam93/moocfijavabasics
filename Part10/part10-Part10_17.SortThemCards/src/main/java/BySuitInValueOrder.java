/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;
/**
 *
 * @author james
 */
public class BySuitInValueOrder implements Comparator<Card> {
    
    
    public int compare(Card c1, Card c2){
        if (c1.getSuit().ordinal() - c2.getSuit().ordinal() > 0){
            return 1;
        }
        if (c1.getSuit().ordinal() - c2.getSuit().ordinal() < 0){
        return -1;
        }
        return c1.getValue() - c2.getValue();
        
    }
}
