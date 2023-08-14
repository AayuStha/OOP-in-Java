package np.edu.scst.operator;
public class Bitwise {
    public static void main(String[] args) {
        // binary operator works on binary and returns result in decimal
        byte a = 10;
        byte b = 20; 
        System.out.println(a|b); //30
        System.out.println(a&b); //0
        System.out.println(a^b); //xor gate same=0; diff=1 //30
        System.out.println(~a); //complement //-11
        
        //        128  64   32  16    8  4  2  1
        //   a=    0    0   0   0     1  0  1  0
        //   b=    0    0   0   1     0  1  0  0
        // a|b=    0    0   0   1     1  1  1  0
        // a&b=    0    0   0   0     0  0  0  0
        // a^b=    0    0   0   1     1  1  1  0
        // ~a=     1    1   1   1     0  1  0  1
    }
}
