package FlowControl.Conditioning;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        double math,phy,social,chem,bio;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in maths: ");
        math = sc.nextDouble();

        System.out.print("Enter marks in phy: ");
        phy = sc.nextDouble();
        System.out.print("Enter marks in social: ");
        social = sc.nextDouble();
        System.out.print("Enter marks in chemistry: ");
        chem = sc.nextDouble();
        System.out.print("Enter marks in bio: ");
        bio = sc.nextDouble();

        double percentage = ((math + phy + chem + bio + social) / 5) * 100;

        if(percentage >= 90 && percentage <= 100){
            System.out.println("Grade A");
        }else if(percentage >= 80 && percentage < 90){
            System.out.println("Grade B");
        }else if(percentage >= 60 && percentage < 80){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
    }
}
