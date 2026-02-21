package TCSNQT;

public class ProductOfNumbers {
    

    public static void main(String[] args) {
        int num = 5244;

        int product = 1;
        int sum = 0;

        
        while(num > 0){
            int digit = num % 10;
            product = product * digit;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println(product - sum);
    }
}
