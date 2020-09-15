/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author james
 */
public class GradeManager {
    private ArrayList<Integer> grades;
    private final int passingGrade = 50;
    private int passed;

    public GradeManager() {
        this.grades = new ArrayList<>();
        this.passed = 0;

    }
    
    public void addGrade(int grade){
        if (grade >= 0 && grade <= 100){
            this.grades.add(grade);
        }
    }
    public double getAverage(){
        int sum = 0;
        for (int grade: grades){
            sum += grade;
        }
        double average = (1.0 * sum / grades.size());
        return average;
    }
    public double getAveragePassingGrade(){
        int sum = 0;
        int count = 0;
        for (int grade: grades){
            if (grade >= passingGrade){
                sum += grade;
                count++;
                this.passed += 1;
            }
        }
        double average = (1.0 * sum) / count;
        return average;
    }
    public double getPassingPercentage(){
        double passPercent = (100 * (1.0 * passed )) / grades.size();
        return passPercent;
    }
    public int getDistribution(int mark){
        int count = 0;
        if (mark == 5){
            for (int grade: grades){
                if (grade >= 90){
                    count++;
                }
            }
        }
        if (mark == 4){
            for (int grade: grades){
                if (grade < 90 && grade >= 80){
                    count++;
                }
            }
        }
        if (mark == 3){
            for (int grade: grades){
                if (grade <80 && grade >= 70){
                    count++;
                }
            }
        }
        if (mark == 2){
            for (int grade: grades){
                if (grade <70 && grade >= 60){
                    count++;
                }
            }
        }
        if (mark == 1){
            for (int grade: grades){
                if (grade <60 && grade >= 50){
                    count++;
                }
            }
        }
        if (mark == 0){
            for (int grade: grades){
                if (grade < 50){
                    count++;
                }
            }
        }
    return count;    
    }
    
    
}
