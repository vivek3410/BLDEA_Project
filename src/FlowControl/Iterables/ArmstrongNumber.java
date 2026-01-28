package FlowControl.Iterables;

import java.util.Scanner;

public class ArmstrongNumber {

    public static int countDigits(int n){
        int count = 0;

        while(n > 0){
            count++;
            n = n / 10;
        }

        return count;
    }

    public static boolean isArmstrong(int n){
        int current = n;
        int sum = 0;
        // int count = countDigits(n);
        String str = String.valueOf(n);
        int count = str.length();

        while(current > 0){
            int digit = current % 10;
            sum = sum + (int) Math.pow(digit,count);
            current = current / 10;
        }

        return sum == n;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();

//         boolean result = isArmstrong(num);
// 
//         if(result){
//             System.out.println("is an Armstrong");
//         }else{
//             System.out.println("Not an Armstrong number");
//         }

        for(int i = 1;i <= 1000 ;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
}
