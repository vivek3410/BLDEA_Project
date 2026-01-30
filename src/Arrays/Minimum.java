package Arrays;

import java.util.Arrays;

public class Minimum{
    
    // TC: O(n log n)
    public static int bruteForce(int[] arr){
        Arrays.sort(arr);

        ArraysIO.print(arr);
        return arr[0];
    }

    

    // TC: O(n) SC: O(1)
    public static int better(int[] arr){
        int smallest = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        
        int max = better(arr);

        System.out.println("Max: "+ max);

    }
}
