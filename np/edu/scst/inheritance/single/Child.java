package np.edu.scst.inheritance.single;

public class Child extends Parent {
    public static void main(String[] args) {
        Child c= new Child();
        System.out.println(c.parentProperty);
        c.car();
        
    }
}
