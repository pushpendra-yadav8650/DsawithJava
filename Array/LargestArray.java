package Array;

import java.util.*;

public class LargestArray {
    public static int Largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int  i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] ={1,2,3,4,5,6,7,6,7,9};
        System.out.println(Largest(numbers));
    }
}
