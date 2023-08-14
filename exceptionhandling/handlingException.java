package exceptionhandling;
public class handlingException {
    public static void main(String[] args) {
        System.out.println("apple");
        System.out.println("ball");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("exception occured"+e.getMessage());
        }
        finally{//optional block
            System.out.println("I run Always");
        }
        System.out.println("cat");
        System.out.println("dog");
    }
}
