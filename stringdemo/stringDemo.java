package stringdemo;
public class stringDemo {
    public static void main(String[] args) {
        //string creation
        String a = "Hello";
        String b = new String ("Hello");
        String c = "Hello";
        
        //comparison
        // (dot equals) compares value of 2 strings
        // (double equals) compares if 2 objects point to the same memory location
        
        System.out.println(a.equals(b)); //true
        System.out.println(a.equals(c)); //true
        
        System.out.println(a == b); //false
        System.out.println(a == c); //true
        
        //concatenation
        a +="world";
        a = a.concat("How are you"); //Hello world how are you.
        
        //changeing case
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
    }
    
}
