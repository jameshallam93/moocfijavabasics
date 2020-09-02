

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int noOfTimes){
        int i = 1;
        while (i < noOfTimes + 1){
            System.out.println(i);
            i += 1;
                    
        }
    }
}
