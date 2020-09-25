
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        ArrayList<CountryData> countryData = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("literacy.csv")).forEach(line -> data.add(line));
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        data.stream().map(line -> line.split(","))
                .forEach(line -> countryData.add(new CountryData(line[3], Integer.valueOf(line[4]), line[2], Double.valueOf(line[5]))));
        
        
        countryData.stream().sorted((c1, c2) -> {return c1.compareTo(c2);
        }).forEach(line -> System.out.println(line.toString()));

    }
}
