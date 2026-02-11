package ExceptionHandling;

public class PrintingMethods {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            // e.printStackTrace();
            // System.out.println(e);
            System.out.println(e.getMessage());
        }

        System.out.println("Statment 3");
    }
}
