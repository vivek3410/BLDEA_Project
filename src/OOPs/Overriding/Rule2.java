package OOPs.Overriding;
// after 1.5 v convarent type
class P{

    public Object m1(){
        System.out.println("Parent");

        return null;
    }
}

class C extends P{

    public String m1(){
        System.out.println("Child");

        return null;
    }
}

public class Rule2 {
    public static void main(String[] args) {
        P p = new P();
        C c = new C();

        P p1 = new C();

        p.m1(); // parent
        c.m1(); // Overding child
        p1.m1();

    }


}
