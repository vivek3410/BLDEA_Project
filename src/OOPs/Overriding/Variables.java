package OOPs.Overriding;

import java.util.ArrayList;

class Parent {
    int x = 888;
    static int y = 200;
}

class Child extends Parent {
    int x = 999;
    static int y = 400;
}

public class Variables {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        Parent p1 = new Child(); 

        ArrayList<Integer> list = new ArrayList<>();

        list.get(0);

        Object o = list.get(0);

        // List list = new ArrayList<>();

        System.out.println(p.x); // parent
        System.out.println(c.x); // child
        System.out.println(p1.x); // parent
        System.out.println();

        System.out.println(Parent.y); // 
        System.out.println(Child.y);
        System.out.println(p1.y); // parent

    }
}
