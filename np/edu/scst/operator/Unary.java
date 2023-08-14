package np.edu.scst.operator;
public class Unary {
    //unary operator needs single operand
    public static void main(String[] args) {
        //increment and decrement operators are unary operators ++ --
        //they are further divided into 2 types: post and pre
        int i=10;
        System.out.println(i); //10
        System.out.println(i++); //10
        //i=11
        System.out.println(++i); //12
        System.out.println(i--); //12
        //i=11
        System.out.println(--i); //10
        System.out.println(i);   //10        
    }
}
