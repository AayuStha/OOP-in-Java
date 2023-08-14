package iodemo;
import java.io.*;
public class FileOutputStreamDemo {
  //byte stream  
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("test.txt");
                                                            // true=append
        FileOutputStream fos = new FileOutputStream("out.txt", true);
        int i = 0;
        //                       EOF
        while((i = fis.read()) !=-1  ){
            fos.write(i);
        }
        fos.close();
        fis.close();
    }
}

