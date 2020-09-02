
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number){
            System.out.print(" ");
            i++;
        }
        
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 0;
        int j = 0;
        int k = 1;
        int l = size - k;
        while (i < size){
            printSpaces(l);
            printStars(k);
            i++;
            k++;
            l = size - k;
        }
    }
        
    

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int width = (height * 2) - 1;
        int stars = 1;
        int spaces = height - 1;
        int i = 0;
        int gap = (width - 3)/2;
        while (i < height){
            printSpaces(spaces);
            printStars(stars);
            spaces -= 1;
            stars += 2;
            i += 1;
        }
        i = 0;
        while (i < 2){
            printSpaces(gap);
            printStars(3);
            i++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(4);
    }
}
