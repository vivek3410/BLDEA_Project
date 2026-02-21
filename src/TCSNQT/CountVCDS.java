package TCSNQT;

public class CountVCDS {

    public static void solution(String s){
        int vowelCount = 0;
        int consonentsCount = 0;
        int digitCount = 0;
        int symbolCount = 0;

        String vowels = "aeiou";
        String digits = "0123456789";
        String symbols = "!@#$%^&";

        char[] ch = s.toCharArray();

        for(int i = 0;i<ch.length;i++){
            if(vowels.contains(Character.toString(ch[i]))){
                vowelCount++;
            }else if(digits.contains(Character.toString(ch[i]))){
                digitCount++;
            }else if(symbols.contains(Character.toString(ch[i]))){
                symbolCount++;
            }else{
                consonentsCount++;
            }
        }

        System.out.println("vowels = " + vowelCount);
        System.out.println("consonents = " + consonentsCount);
        System.out.println("digits = " + digitCount);
        System.out.println("symbols = " + symbolCount);
    }
    

    public static void main(String[] args) {
        String s = "123456aeiou@#%vvv";

        // vowels = 5, consonets = 3, digits = 6, symbols = 3

        solution(s);
    }
}
