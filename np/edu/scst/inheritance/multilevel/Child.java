package np.edu.scst.inheritance.multilevel;

    public class Child extends Parent {
    public static void main(String[] args) {
        Child c= new Child();
        System.out.println(c.parentProperty);
        System.out.println(c.parentProp);
        c.car();
        c.bike();
        
    } 
}

