package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
    

    public static void main(String[] args) throws IOException{
        /*
        constructors
        1. BufferedWriter bw = new BufferedWriter(Wirter w);
        2. BufferedWriter bw = new BufferedWriter(Wirter w,int bufferedSize);
        

        BufferedWriter bw = new BufferedWriter("abc.txt") (invalid)
        BufferedWriter bw = new BufferedWriter(new File("abc.txt")) (invalid)
        BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt")) (valid)
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter("abc.txt"))) (valid)

        Methods 6:

        newLine();

        */
        File f = new File("src/FileHandling","abc.txt");
        FileWriter f2 = new FileWriter(f,true);

        BufferedWriter bw = new BufferedWriter(f2);

        // method 3
        bw.write("world");

        bw.newLine();

        bw.write("Vivek");

        bw.close();

        /*
            
        
        */




    }
}
