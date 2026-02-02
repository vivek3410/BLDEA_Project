package Strings;

public class Examples {

    public static void ex1(){
        String s1 = new String("vivek");
        String s2 = new String("vivek");
        String s3 = "vivek";
        String s4 = "vivek";
    }

    public static void ex2(){
        String s = new String("java");
        s.concat("dsa");
        s = s.concat("programming");

        System.out.println(s);
    }

    public static void ex3(){
        String s1 = new String("Spring");
        s1.concat("Fall");
        String s2 = s1.concat("Winter");
        s2.concat("Summer");

        System.out.println(s1);
        System.out.println(s2);

    }

    public static void ex4(){
        String s1 = new String("You cannot change me");
        String s2 = new String("You cannot change me");
        System.out.println(s1 == s2);

        String s3 = "You cannot change me";
        System.out.println(s1 == s3);

        String s4 = "You cannot change me";

        System.out.println(s3 == s4); // true

        String s5 = "You cannot " + "change me";
        System.out.println(s4 == s5); // true

        String s6 = "You cannot ";
        String s7 = s6 + "change me";
        System.out.println(s4 == s7); //false

        final String s8 = "You cannot ";
        String s9 = s8 + "change me";

        System.out.println(s4 == s9);  //true
        

        
    }
    

    public static void main(String[] args) {
        ex4();


    }
}
