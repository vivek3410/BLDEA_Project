package ExceptionHandling;


public class Example {
    
    public static void main(String[] args) {

        try{
            System.out.println("Outer Try block");

            try{
                System.out.println("Inner Try block");
                System.out.println(10 / 0);
            }catch(ArithmeticException e){
                System.out.println("Inner Catch Block");
            }finally{
                System.out.println("Inner Finally block");
            }

            System.out.println("Outside of Inner try block");
        }catch(ArithmeticException e){
            System.out.println("Outer Catch Block");
        }finally{
            System.out.println("Outer finnaly block");
        }

        /*
            Output:
                Outer try block
                Inner try block
                Inner Finnaly block
                Outside of inner try block
                Outer finnaly block


            Output case 2:
                Outer try block 
                Inner try block
                Inner catch block
                Inncer finnaly block
                outside of inner try block
                outer finnaly block
        */
        


        /*
        try{
            s - 1
            s - 2 
            s - 3
        }catch(ArthemticException e){
            s - 4
        }finally {
            s - 5
        }
        s - 6

        case 1: if theres no exceptions
        1, 2, 3, 5, 6 , NT

        case 2: If theres exception at s - 2 (Arthemtic Exception) and it is handled
        1, 4, 5, NT

        case 3: If therese exception at s - 2 (SQLException) it is not handled
        1, 5, AT

        Case 4: If therese exception at s - 4
         5 , AT

        Case 5: if therese exception at s - 5 and s - 6
        AT

        */
        
    }
}
