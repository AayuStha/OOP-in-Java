
package np.edu.scst.control.statement;


public class SwitchCase {
    public static void main(String[] args) {
        int a =7;
        int b = 11;
        String operator = "+";
        switch(operator){
            case "+":{
                System.out.println(a + b);
            }
            break;
            case "-":{
                System.out.println(a - b);
            }
            break;
            default:{
                System.out.println("invalid operator"
                        + " ");
            }
        }
    }
    
}
