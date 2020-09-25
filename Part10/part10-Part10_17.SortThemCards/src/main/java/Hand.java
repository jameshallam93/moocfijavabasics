/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;

/**
 *
 * @author james
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public int getValue(){
        int totalValue = 0;
        for (Card card: cards){
            totalValue = totalValue + card.getValue();
        }
        return totalValue;
    }
    
    public void sort(){
        Comparator<Card> compare = Comparator.comparing(Card::getValue).thenComparing(Card::getSuit);
        
        Collections.sort(cards, compare);
        
    }            
    @Override
    public int compareTo(Hand hand){
        return (this.getValue() - hand.getValue());
    }
    
    public void sortBySuit(){
        
        Collections.sort(this.cards, new BySuitInValueOrder());
        
    }

    
    public void print(){
        this.cards.stream()
                .forEach(card -> System.out.println(card.toString()));
    }
}
