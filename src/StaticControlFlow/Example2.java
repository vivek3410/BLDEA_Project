package StaticControlFlow;

public class Example2 {
    static int i = 10;

    static {
        // m1();
        System.out.println("FSB: " + i);
    }

    public static void main(String[] args) {
        System.out.println("main" + i);
    }

    public static void m1(){
        System.out.println(i);
    }
}
