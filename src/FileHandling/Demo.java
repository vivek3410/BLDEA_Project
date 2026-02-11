package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {
    
    public static void main(String[] args) throws IOException{
        File f = new File("src/FileHandling","abc.txt");
        System.out.println(f.length());
    }
}


