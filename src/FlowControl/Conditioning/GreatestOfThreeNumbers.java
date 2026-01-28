package FlowControl.Conditioning;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number a,b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Approch 1
        if(a > b && a > c){
            System.out.println("a is greater");
        }else if(b > a && b > c){
            System.out.println("B is greater");
        }else{
            System.out.println("C is greater");
        }


        // Approch 2
        System.out.println(Math.max(a, Math.max(b, c) ));

    }

}
