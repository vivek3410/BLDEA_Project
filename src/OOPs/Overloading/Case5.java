package OOPs.Overloading;

public class Case5 {

    public void m1(int x){
        System.out.println("general method");
    }

    public void m1(int... x){
        System.out.println("var args method");
    }

    public static void main(String[] args) {
        Case5 c = new Case5();

        c.m1(); // var args
        c.m1(10); // genral Argument type
        c.m1(10,20,30,40); // var args
    }
}
