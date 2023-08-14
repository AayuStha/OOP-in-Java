package exceptionhandling;
public class multipleCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println(10-3w);
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception");
        }
        catch(NumberFormatException e){
            System.out.println("numberformat expression");
        }
        catch(Exception e){
            System.out.println("super class expression");
        }
    }
}
