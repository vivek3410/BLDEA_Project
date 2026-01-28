package FlowControl.Iterables;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int result = 1;

        // TC: o(n - 1) -> o(n)
        for(int i = 2;i<=num;i++){
            result = result * i;
        }

        System.out.println("Factorial: " + result);
    }
}
