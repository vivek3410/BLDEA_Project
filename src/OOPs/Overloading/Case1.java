package OOPs.Overloading;



public class Case1 {

    public void m1(int x){
        System.out.println("integer method");
    }

    public void m1(float f){
        System.out.println("Float method");
    }

    
    public static void main(String[] args) {
        Case1 c = new Case1();

        c.m1(10);
        c.m1(10f);
        c.m1('a');
        // c.m1(10.5);
    }
}
