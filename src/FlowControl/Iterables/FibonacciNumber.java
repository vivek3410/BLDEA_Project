package FlowControl.Iterables;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // int a = -1;
        // int b = 1;
        // for(int i = 1;i<= num;i++){
        //     int sum = a + b;
        //     System.out.print(sum + " ");
        //     a = b;
        //     b = sum;
        // }

        int a = 10;
        int b = 20;

        System.out.println(b - (b = a));
    }
}
