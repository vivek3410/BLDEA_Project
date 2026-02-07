package ObjetTypeCasting;

public class Rule3 {
    

    public static void main(String[] args) {
        // Run time object of 'd' should be either same or derived type of 'c'
        // A b = (c) d 

        // valid example
        String o = new String();
        Object sb = (String)o;

        // Invalid example
        // Object o1 = new String();
        // StringBuffer sb1 = (StringBuffer)o;
    }
}
