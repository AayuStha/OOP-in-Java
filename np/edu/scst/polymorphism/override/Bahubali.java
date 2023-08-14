package np.edu.scst.polymorphism.override;

public class Bahubali extends Shivgami {
    @Override
    public void gift(){
        System.out.println("Devsena");
    }
    public static void main(String[] args) {
        Bahubali g= new Bahubali();
        g.gift();
    }//runtime polymorphism            dynamic method dispatch
    
}
