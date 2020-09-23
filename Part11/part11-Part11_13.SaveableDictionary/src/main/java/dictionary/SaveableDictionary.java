/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.*;
import java.io.File;
import java.io.*;
import java.nio.file.Paths;
/**
 *
 * @author james
 */
public class SaveableDictionary {
    private Map<String, String> dictionary;
    private Map<String, String> translate;
    private String file;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap();
        this.translate = new HashMap();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap();
        this.translate = new HashMap();
        this.file = file;
        
    }
    public void add(String words, String translation){
        if (this.dictionary.containsKey(words) || this.dictionary.containsValue(words)){
            return;
        }
        this.dictionary.put(words, translation);
        this.translate.put(translation, words);
    }
    public String translate(String word){
        String translation = this.dictionary.get(word);
        if (translation == null){
            translation = this.translate.get(word);
        }
        return translation;
    }
    
    public boolean load(){
        try(Scanner scanner = new Scanner(Paths.get(this.file))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(":");
                this.dictionary.put(words[0], words[1]);
                this.translate.put(words[1], words[0]);
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }
    
    public boolean save() {
        try{
        PrintWriter writer = new PrintWriter(this.file);
        String wordAndTranslation = "";
        for (String word: this.dictionary.keySet()){
            wordAndTranslation = wordAndTranslation + word + ":";
            wordAndTranslation = wordAndTranslation + this.dictionary.get(word) + "\n";   
        }
        writer.write(wordAndTranslation);
        writer.flush();
        return true;
        }catch(Exception e){
            return false;
        }
        
    }
    
    
    public void delete(String word){
        String altDelete = "";
        if (dictionary.containsKey(word)){
            altDelete = dictionary.get(word);
            dictionary.remove(word);
            translate.remove(altDelete);
        }
        if (translate.containsKey(word)){
            altDelete = translate.get(word);
            translate.remove(word);
            dictionary.remove(altDelete);
        }
        

    }
}
