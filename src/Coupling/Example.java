package Coupling;

class A {
    static int a = B.b;
}

class B {
    static int b =  C.y;
}

class C {
    static int y = D.x;
}

class D{
    static int x = 20;
}

public class Example {
    public static void main(String[] args) {
        // A a = new A();
    }
}
