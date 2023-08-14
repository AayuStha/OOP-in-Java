
package np.edu.scst.control.statement;


public class IfElse 
{
    public static void main(String[] args)
    {
        int a = 6;
        
        if(a % 2 == 0){
            System.out.println("even");
        }
        else if(a % 2 != 0){
            System.out.println("odd");
        }
        else if(true){
            System.out.println("true");
        }
        else{
            System.out.println("invalid number");
        }
    }
}
