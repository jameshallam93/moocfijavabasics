
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        if (value < 5000){
            System.out.println("No Tax!");
        }else if (value >= 5000 && value <25000){
            int additional = value - 5000;
            double tax = 100 + (additional * .08);
            System.out.println("Tax: " + tax);
        }else if (value >= 25000 && value <55000){
            int additional = value - 25000;
            double tax = 1700 + (additional * .1);
            System.out.println("Tax: " + tax);
        }else if (value >= 55000 && value <200000){
            int additional = value - 55000;
            double tax = 4700 + (additional * .12);
            System.out.println("Tax: " + tax);
        }else if (value >= 200000 && value <1000000){
            int additional = value - 200000;
            double tax = 22100 + (additional * .15);
            System.out.println("Tax: " + tax);
        }else if (value >1000000){
            int additional = value - 1000000;
            double tax = 142100 + (additional * .17);
            System.out.println("Tax: " + tax);
        }



    }
}
