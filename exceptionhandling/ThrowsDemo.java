package exceptionhandling;
public class ThrowsDemo {
    public static void jumpingPodium() throws JumpAtYourOwnRisk{
        throw new JumpAtYourOwnRisk("Falling from this height may prove fatal"); 
    }
    public static void main(String[] args) throws JumpAtYourOwnRisk {
        jumpingPodium();
        System.out.println("I won't run");
    }
}

class JumpAtYourOwnRisk extends Exception{//custom exception
    public JumpAtYourOwnRisk(String msg){
        super(msg);
    } 
}