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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
        
    }
    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        dictionary.get(word).add(translation);
    }
    public ArrayList<String> translate(String word){
        ArrayList<String> translations = new ArrayList<>();
        
        if (!(dictionary.containsKey(word))){
            return translations;
        }
        if (dictionary.get(word).isEmpty()){
            return translations;
        }

        translations = dictionary.get(word);
        return translations;
        
    }
    public void remove(String word){
        dictionary.remove(word);
    }
}
