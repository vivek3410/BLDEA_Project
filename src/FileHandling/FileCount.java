package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCount {

    /*
        Constructors:
        1. File f = new File(String fname);

        2. File f = new File(String subDir,String fname);
        3. File f = new File(File subDir,String fname);


    
    */
    
    public static void main(String[] args) throws IOException {

        // File f = new File("src/FileHandling","abc.txt");
        // File f1 = new File("src/FileHandling","demo");
        // f1.mkdir();
        // f = new File(f1, "demo.txt");
        // f.createNewFile();
        // f.exists();

        File f = new File("src");
        String[] lists = f.list();
        int fCount = 0;
        int DCount = 0;

        f.isFile();
        for(String item : lists){
            File f1 = new File(item);
            if(f1.isFile()){
                fCount++;
            }else{
                DCount++;
            }
        }

        System.out.println("Total File: "+ fCount);
        System.out.println("Total Dir: " + DCount);
    }
}
