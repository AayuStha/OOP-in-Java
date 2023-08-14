package np.edu.scst.abstraction.interfacedemo;
public class Child implements Parent{
    public void doThis(){
        System.out.println("Hii");
    }
    public static void main(String[] args) {
        Child says = new Child();
        says.doThis();
    }
}
