
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList<Bird> birds = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        
        while (true){
            System.out.println("?");
            String command = scan.nextLine();
            if (command.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in latin:");
                String latinName = scan.nextLine();
                birds.add(new Bird(name, latinName));

            }
            if (command.equals("Observation")){
                System.out.println("Bird?");
                String observedBird = scan.nextLine();
                for (Bird bird: birds){
                    if (observedBird.equals(bird.getName())){
                        bird.addSighting();
                    }
                }
            }
            if (command.equals("All")){
                for (Bird bird: birds){
                    System.out.println(bird.toString());
                }
            }
            if (command.equals("One")){
                System.out.println("Bird?");
                String birdToPrint = scan.nextLine();
                for (Bird bird: birds){
                    if (bird.getName().equals(birdToPrint)){
                        System.out.println(bird.toString());
                    }
                }
            }
            if (command.equals("Quit")){
                break;
            }
        }

    }

}
