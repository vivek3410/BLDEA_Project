package Strings;

public class Series {
    

    public static void main(String[] args) {
        StringBuffer series = new StringBuffer();

        for(int i = 0;i<26;i++){
            char ch = (char) ('a' + i);
            // series += ch;

            series.append(ch);
        }

        System.out.println(series);
    }
}
