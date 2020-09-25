
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> returnList = numbers.stream()
                .filter(s -> s>0)
                .collect(Collectors.toList());
        return returnList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

}
