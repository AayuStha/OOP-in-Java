package np.edu.scst.operator;
public class Logical {
    public static void main(String[] args) {
        //logical operator, ultimately works on boolean data
        //result of logical is always boolean
        boolean isRainy = false;
        boolean isSunny = true;
        boolean isWindy = false;
        // logical operators are &&, ||, !
        // && -> both condition must be true to return true
        // || -> either or both condition must be true to return true
        // ! -> returns complement
        if (isRainy || isSunny) { //true
            System.out.println("take umbrella");
        }
        if (!isWindy) { //true
            System.out.println("let's fly drone");
        }
        if (isRainy && isWindy) { //false
            System.out.println("lets bunk the class");
        }
    }
}
