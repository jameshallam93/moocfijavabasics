
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int index = 0;
        while (index < array.length){
            System.out.println("");
            int index2 = 0;
            int noOfStars = array[index];
            while (index2 < noOfStars){
                System.out.print("*");
                index2++;
            }
            index++;
            
        }
    }

}
