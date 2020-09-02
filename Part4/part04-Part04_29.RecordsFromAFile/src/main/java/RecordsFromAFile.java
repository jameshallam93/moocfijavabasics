
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String row = reader.nextLine();
                String parts[] = row.split(",");
                
                int age = Integer.valueOf(parts[1]);
                String years = "years";
                if (age == 1){
                    years = "year";
                }
                System.out.println(parts[0] + ", age: " + age + " " + years);
            }
            
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        

    }
}
