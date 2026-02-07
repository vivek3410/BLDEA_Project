package ObjetTypeCasting;

class A{
    int x = 777;
    public void m1(){
        System.out.println("A");
    }
}

class B extends A{
    int x = 888;
    public void m1(){
        System.out.println("B");
    }
}

class C extends B{
    int x = 999;
    public void m1(){
        System.out.println("C");
    }
}

public class Questions {
    public static void ex2(){
        C c = new C();
        c.m1(); // c
        ((B)c).m1();
        ((A)((B)c)).m1();
    }

    public static void ex4(){
        C c = new C();
        System.out.println(c.x);// 999
        System.out.println(((B)c).x); // 888
        System.out.println(((A)((B)c)).x); // 777
    }

    public static void main(String[] args) {
        ex4();
    }
}
