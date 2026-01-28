package FlowControl.Iterables;

import java.util.Scanner;

public class PrimeNumber {
    
    public static boolean isPrime(int n){

        // O(n)
        for(int i = 2;i<n;i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Check the single number
//         boolean result = isPrime(n);
// 
//         if(result) {
//             System.out.println("The number is prime");
//         }else{
//             System.out.println("Not prime");
//         }

        // Printing the series of prime
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
