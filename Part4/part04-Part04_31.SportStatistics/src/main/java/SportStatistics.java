
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        
        int gameCount = 0;
        int winCount = 0;
        try (Scanner reader = new Scanner(Paths.get(fileName))){
            while (reader.hasNextLine()){
                String row = reader.nextLine();
                if (row.contains(team)){
                    gameCount++;
                String parts[] = row.split(",");
                if ((parts[0].equals(team)) && (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3]))){
                    winCount++;
                    
                }else if (parts[1].equals(team) && Integer.valueOf(parts[3])>Integer.valueOf(parts[2])){
                    winCount++;
                }

                }
                
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            
        }System.out.println("Games: " + gameCount);
        int losses = gameCount - winCount;
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + losses);

    }

}
