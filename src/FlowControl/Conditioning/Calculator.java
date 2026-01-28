package FlowControl.Conditioning;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======= Menu =======");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for division");

        System.out.print("Enter the Numbers: ");
        double a = sc.nextInt();
        double b = sc.nextInt();

        System.out.print("Enter the choice: ");
        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if(b == 0){
                    System.out.println("Cannot be divided by 0");
                    break;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("Result: " + result);

    }
}
