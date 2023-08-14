package exceptionhandling;
public class ThrowDemo {
    public static void main(String[] args) {
        int balance = 500;
        int withDrawl = 1000;
        if (balance <= withDrawl){
            throw new ArithmeticException("insufficient balance");
    }
        System.out.println("Here is your money");
    }
}


//I throw
//Java Throws