/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james
 */
public class CountryData implements Comparable<CountryData>{
    
    private String country;
    private int year;
    private String gender;
    private double percentage;

    public CountryData(String country, int year, String gender, double percentage) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.percentage = percentage;
    }
    
    public double getPercentage(){

        return this.percentage;
    }
    public void genderConvert(){
        if (this.gender.contains("female")){
            this.gender = "female";
            return;
        }
        if (this.gender.contains("male")){
            this.gender = "male";
        }

    }
    
    @Override
    public String toString(){
        this.genderConvert();
        return this.country + " (" + this.year + "), "  + this.gender + ", " + this.percentage;
    }
    
    @Override
    public int compareTo(CountryData data){
        double toConvert = data.percentage - this.percentage;
        if (toConvert > 0){
            return -1;
        }
        if (toConvert < 0){
            return 1;
        }
        return 0;
    }
}
