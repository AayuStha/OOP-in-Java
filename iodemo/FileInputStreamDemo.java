package iodemo;
import java.io.*;
public class FileInputStreamDemo {
  //byte stream  
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("test.txt");
        int i = 0;
        //                       EOF
        while((i = fis.read()) !=-1  ){
            System.out.print((char)i);
        }
        fis.close();
    }
}
