package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
    

    public static void main(String[] args) throws IOException{
        /*
        constructors
        1. Bufferedreadr bw = new BufferedWriter(Wirter w);
        2. BufferedWriter bw = new BufferedWriter(Wirter w,int bufferedSize);
        

        BufferedWriter bw = new BufferedWriter("abc.txt") (invalid)
        BufferedWriter bw = new BufferedWriter(new File("abc.txt")) (invalid)
        BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt")) (valid)
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter("abc.txt"))) (valid)

        Methods 6:

        newLine();

        */
        File f = new File("src/FileHandling","abc.txt");
        FileReader f2 = new FileReader(f);

        BufferedReader br = new BufferedReader(f2);

        // method 3
        // int c = bw.read();


        String line = br.readLine();

        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }

        br.close();

        /*
            
        
        */




    }
}
