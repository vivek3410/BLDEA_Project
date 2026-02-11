package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    

    public static void main(String[] args) throws IOException{
        // Constructor 1
        // FileReader fr = new FileReader(String fname)
        // FileReader fr = new FileReader(Fiil f)
        File f = new File("src/FileHandling","abc.txt");

        FileReader out = new FileReader(f);

        // Method 1
//         int c = out.read();
// 
//         while(c != -1){
//             System.out.print((char) c);
//             c = out.read(); // updating
//         }

        // method 2
        char[] ch = new char[(int)f.length()];
        int lenght = out.read(ch);
        System.out.println(lenght);

        // method 3
        out.close();




    }
}
