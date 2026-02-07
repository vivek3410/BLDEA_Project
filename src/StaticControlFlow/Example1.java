package StaticControlFlow;

public class Example1 {
    
    static int i = 10;

    static {
        m1();
        // System.out.println(j);
        System.out.println("First static Block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Main block");
    }

    public static void m1(){
        System.out.println(j);
    }

    static {
        System.out.println("Second static block");
    }

    static int j = 20;
}
