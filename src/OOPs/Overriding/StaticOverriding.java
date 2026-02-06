package OOPs.Overriding;

class Parent {
    public static void m1(){
        System.out.println("parent");
    }
}

class Child extends Parent {
    public static void m1(){
        System.out.println("Child");
    }
}

public class StaticOverriding {
    

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        Parent p1 = new Child();

        p.m1(); // parent
        c.m1(); // child

        p1.m1(); // Method Hiding // Parent
    }
}
