package OOPs.IS_A;

class P {
    public void m1(){
        System.out.println("M1 METHOD");
    }
}


class C extends P {
    public void m2(){
        System.out.println("M2 METHOD");
    }
}


public class Inhertance {
    
    public static void main(String[] args) {
        P p = new P();

        p.m1();

        C c = new C();
        c.m2();
        c.m1();

        P p1 = new C();

        p1.m1();

    }
}
