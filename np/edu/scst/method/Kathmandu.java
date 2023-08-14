
package np.edu.scst.method;
public class Kathmandu {
    public static void main(String[] args) {
        System.out.println("Good Morning");
        System.out.println("bhok Lagyo");
        cook();
        System.out.println("Ac Bigriyo");
        int wallet=electrician(1000);
        System.out.println(wallet);
        System.out.println("Thank You");
        cook();
        System.out.println("Good Night");
    }
    public static void cook() {
        System.out.println("Khana pakaye");
    }
    public static int electrician(int fees){
        System.out.println("AC banayo");
        int change= fees-500;
        return change;
    }
    
}
