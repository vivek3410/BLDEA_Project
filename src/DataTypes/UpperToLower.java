package DataTypes;

public class UpperToLower {
    
    // a -> 97 to 122
    // A -> 65 to 90

    public static char conversion(char c){
        if(c >= 65 && c <= 90){
            return (char) (c + 32);
        }else{
            return c;
        }
    }


    public static void main(String[] args) {

        char c = 'A';

        System.out.println(conversion(c));
    
    }
}
