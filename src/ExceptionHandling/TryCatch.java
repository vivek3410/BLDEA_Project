package ExceptionHandling;


public class TryCatch {
    
    public static void main(String[] args) {
        System.out.println("Statement 1");
        // System.out.println(10 / 0);
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            // Method 1
            // e.printStackTrace(); // name, description and stack trace

            // Method 2
            // System.out.println(e); // name and description

            // Method 3
            System.out.println(e.getMessage()); // description
            // System.out.println(10/2);
        }
        System.out.println("Statment 3");
    }
}
