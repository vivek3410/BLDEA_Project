package Arrays;

import java.util.Scanner;

public class SumOfElements {

    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }

        return sum;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[10];
        for(int i = 0;i<size;i++){
            System.out.print("Enter the element at index " + i + " ");
            arr[i] = sc.nextInt();
        }

        int result = sum(arr);

        System.out.println("Sum of Elements " + result);
    }
}
