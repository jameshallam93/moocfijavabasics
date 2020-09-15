
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int number: array){
            if (number < smallest){
                smallest = number;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                index = i;
                smallest = array[i];
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int smallest = array[startIndex];
        int index = startIndex;
        for (int i = index; i < array.length; i++){
            if (array[i] < smallest){
                index = i;
                smallest = array[i];
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2){
        int temporaryInt = array[index1];
        array[index1] = array[index2];
        array[index2] = temporaryInt;
    }
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            

            
        }
    }

}
