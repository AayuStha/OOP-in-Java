package iodemo;
import java.io.*;
public class FileReaderDemo {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("test.txt");
        int i = 0;
        //                       EOF
        while((i = fr.read()) !=-1 ){
            System.out.print((char)i);
        }
        fr.close();
    }
}
