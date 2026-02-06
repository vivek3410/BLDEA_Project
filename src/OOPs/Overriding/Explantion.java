package OOPs.Overriding;

class P{

    public void m1(){
        System.out.println("Parent");
    }
}

class C extends P{

    public void m1(){
        System.out.println("Child");
    }
}

public class Explantion {
    public static void main(String[] args) {
        P p = new P();
        C c = new C();

        P p1 = new C();

        p.m1(); // parent
        c.m1(); // Overding child
        p1.m1(); 

    }


}
