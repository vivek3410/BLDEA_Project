package ObjetTypeCasting;

public class Rule2 {
    
    public static void main(String[] args) {
        // C Should be same or derived type of A
        // A b = (c)d;

        // Valid example
        Object o = new String();
        StringBuffer sb = (StringBuffer) o;

        // Invalid Example
        String s = new String();
        // StringBuffer sb1 = (String)s;

    }
}
