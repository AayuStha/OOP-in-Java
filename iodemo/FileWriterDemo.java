package iodemo;
import java.io.*;
public class FileWriterDemo {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("test.txt");
        FileWriter fw = new FileWriter("out.txt", true);
        int i = 0;
        //                       EOF
        while((i = fr.read()) !=-1  ){
            fw.write(i);
        }
        fw.close();
        fr.close();
    }
}
