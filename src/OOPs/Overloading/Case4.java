package OOPs.Overloading;

public class Case4 {

    public void m1(int x,float y){
        System.out.println("int float");
    }

    public void m1(float x,int y){
        System.out.println("float int");
    }
    

    public static void main(String[] args) {
        Case4 c = new Case4();
        c.m1(10, 10f);
        c.m1(10f, 10);
        // c.m1(10, 10); // CTE: Ambigous
        // c.m1(10f, 10f); // CTE: m1 not found

    }
}
