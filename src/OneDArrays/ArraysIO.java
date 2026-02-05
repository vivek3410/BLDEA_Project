package OneDArrays;

import java.util.Scanner;

public class ArraysIO {

    public static int[] input(){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for(int i = 0;i<size;i++){
            System.out.print("Enter the element at index: " + i + " ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        for(int i = 0;i<size;i++){
            System.out.print("Enter the element at index: " + i);
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
