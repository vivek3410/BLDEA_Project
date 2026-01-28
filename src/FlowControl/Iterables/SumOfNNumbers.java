package FlowControl.Iterables;

import java.util.Scanner;

public class SumOfNNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        // TC: o(n) SC: o(1)
        // for(int i = 1;i<=num;i++){
        //     sum = sum + i;
        // }

        // TC: o(1)
        sum = (num * (num + 1)) / 2;
        System.out.println("Sum: " + sum);
    }
}
