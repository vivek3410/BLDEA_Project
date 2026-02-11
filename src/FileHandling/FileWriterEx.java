package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    
    public static void main(String[] args) throws IOException {
        
        File f = new File("src/FileHandling","abc.txt");
        // FileWriter file1 = new FileWriter("abc.txt");
        FileWriter file2 = new FileWriter(f,true);

        // method 1
        // file2.write(100); // d

        // method 2
        char[] ch = {'h','e','l','l','o'};
        file2.write(ch);

        // method 3
        file2.write("world");

        file2.write('\n');

        file2.write("Vivek");

        // Mehod 4
        file2.flush();

        // method 5 
        file2.close();
    }
}
