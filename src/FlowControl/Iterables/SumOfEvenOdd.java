package FlowControl.Iterables;

import java.util.Scanner;

public class SumOfEvenOdd {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 1;i<= num;i++){
            if(i % 2 == 0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }

        System.out.println("Even Sum = " + evenSum + " odd Sum = " + oddSum);
    }
}
