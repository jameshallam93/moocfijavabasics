
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        if (this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        int size = elements.size();
        String alphaList = "";
        for (String name: elements){
            String newLine = "\n";
            int index = this.elements.indexOf(name);
            if (index == this.elements.size() -1){
                newLine = "";
            }

            alphaList = alphaList + name + newLine;
        }
        String s = "s";
        if (this.elements.size() == 1){
            s = "";
        }        
        return "The collection " + this.name + " has " + size + " element" + s + ":" + "\n" + alphaList;
    }
    
}
