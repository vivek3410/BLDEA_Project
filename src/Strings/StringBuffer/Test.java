package Strings.StringBuffer;

public class Test {
    

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("q");
        System.out.println(sb.capacity());
    }
}
