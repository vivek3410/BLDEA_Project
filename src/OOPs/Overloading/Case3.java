package OOPs.Overloading;

public class Case3 {

    public void m1(String s){
        System.out.println("string method");
    }

    public void m1(StringBuffer sb){
        System.out.println("sb method");
    }

    
    public static void main(String[] args) {
        Case3 c = new Case3();

        c.m1("java");
        // c.m1(null); // CTE: Ambigous
        // c.m1(10.5);d
    }
}
