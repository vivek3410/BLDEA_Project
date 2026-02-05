package Strings;

public class StringMethods {
    

    public static void main(String[] args) {
        String s = new String("java");

        System.out.println(s.charAt(0)); // j
        System.out.println(s.concat(" Prog")); // java Prog
        System.out.println(s.equals("Java")); // false
        System.out.println(s.equalsIgnoreCase("JAVA")); // true
        System.out.println(s.length()); // 4
        System.out.println(s.isEmpty()); // false
        System.out.println(s.replace('j', 'y')); // yava
        System.out.println(s.indexOf('a')); // 1
        System.out.println(s.lastIndexOf('a'));  // 3
        System.out.println(s.substring(1)); // ava
        System.out.println(s.substring(1,3)); // av
        System.out.println(s.toUpperCase()); // JAVA
        System.out.println(s.toLowerCase()); // No Object creation -> java
        System.out.println(new String("  java  developer    ").trim());


    }
}
