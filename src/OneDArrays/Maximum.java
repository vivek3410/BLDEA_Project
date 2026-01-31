package OneDArrays;

import java.util.Arrays;

public class Maximum {
    
    // TC: O(n log n)
    public static int bruteForce(int[] arr){
        Arrays.sort(arr);

        ArraysIO.print(arr);
        return arr[arr.length - 1];
    }

    // TC: O(n) SC: O(1)
    public static int better(int[] arr){
        int largest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        
        // int max = bruteForce(arr);
        int max = better(arr);

        System.out.println("Max: "+ max);

    }
}
