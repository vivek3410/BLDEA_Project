package Strings;

import java.util.Scanner;

public class Anagram {

    public static boolean solution(String a,String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length()){
            return false;
        }

        int count[] = new int[26];

        for(int i = 0;i<a.length();i++){
            count[a.charAt(i) - 'a']++;
        }

        for(int i = 0;i<b.length();i++){
            count[b.charAt(i) - 'a']--;
        }

        for(int i = 0;i<26;i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if(solution(a, b)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }


        sc.close();
    }
}
