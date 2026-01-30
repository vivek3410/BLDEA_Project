package Arrays.Searching;

import Arrays.ArraysIO;

public class LinearSearch {

    public static int solution(int[] arr,int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        int result = solution(arr, 2);

        if(result < 0){
            System.out.println("Element is not present");
        }else{
            System.out.println("Element present at index: " + result);
        }
    }
}
