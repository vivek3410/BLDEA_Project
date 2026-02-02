package Strings;

public class Palindrome {

    public static boolean solution(String str){
        for(int i = 0 ;i<str.length();i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }

        return true;
    }
    

    public static void main(String[] args) {
        String str = "abcbcbag";

        boolean result = solution(str);

        System.out.println(result);
    }
}
