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

    public static void ex5(){
        String s1 = new String("java");

        String s2 = s1.toLowerCase();
        String s3 = s1.toUpperCase();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }

    public static void ex6(){
        String s1 = "java";
        String s2 = s1.toString();
        String s3 = s1.toLowerCase();
        String s4 = s1.toUpperCase();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

    }

    public static void ex7(){
        String s = " ";
        s.trim();
        System.out.println(s.equals("") + " " + s.isEmpty());
    }

    public static void ex8(){
        String s1 = "Java";
        String s2 = new String("java");

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }

    public static void ex9(){
        StringBuffer sb = new StringBuffer(5);

        String s = "";

        if(sb.equals(s)){
            System.out.println("Match 1");
        }else if(sb.toString().equals(s.toString())){
            System.out.println("Match 2");
        }else{
            System.out.println("No match");
        }
    }
    

    public static void main(String[] args) {
        // ex6();
        ex8();
    }
}
