package stringdemo;
public class StringBufferDemo {
    public static void main(String[] args) {
        
        //initialization or creation
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer("hello");
        StringBuffer str3 = new StringBuffer(20);
        
        //assigning
        str1.append("hello");
        System.out.println("initial capacity"+ str1.capacity());
        str1.append(" world, we are testing the Capacity");
        System.out.println("initial capacity"+ str1.capacity());
        
        //using
        System.out.println(str1);
    }
}
