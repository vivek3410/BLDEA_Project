package OOPs.Overloading;

public class Case2 {

    public void m1(String s){
        System.out.println("string method");
    }

    public void m1(Object o){
        System.out.println("object method");
    }

    
    public static void main(String[] args) {
        Case2 c = new Case2();

        c.m1("java");
        c.m1(new StringBuffer());   
        c.m1(null);
        // c.m1(10.5);d
    }
}
