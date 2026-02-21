package TCSNQT;

import OneDArrays.ArraysIO;

public class CountLeaders {
        
    public static void solution(int[] arr){

        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] >= max){
                count++;
                max = arr[i];
            }
        }

        System.out.println("Count: "+count);
    }
    

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        solution(arr);
    }
    
}
