/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author james
 */
public class UserInterface {
    private Scanner scanner;
    private GradeManager manager;

    public UserInterface(Scanner scanner, GradeManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }
    
    public void returnStars(int noOfStars){
        for (int i = 0; i < noOfStars; i++){
            System.out.print("*");
        }
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1){
                break;
            }
            manager.addGrade(points);          
        }
        System.out.println("Point average (all): " + manager.getAverage());
        System.out.println("Point average (passing): " + manager.getAveragePassingGrade());
        System.out.println("Pass percentage: " + manager.getPassingPercentage());
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        returnStars(manager.getDistribution(5));
        System.out.print("\n");
        System.out.print("4: ");
        returnStars(manager.getDistribution(4));
        System.out.print("\n");
        System.out.print("3: ");
        returnStars(manager.getDistribution(3));
        System.out.print("\n");
        System.out.print("2: ");
        returnStars(manager.getDistribution(2));
        System.out.print("\n");
        System.out.print("1: ");
        returnStars(manager.getDistribution(1));
        System.out.print("\n");
        System.out.print("0: ");
        returnStars(manager.getDistribution(0));        
    }
    
    
}
