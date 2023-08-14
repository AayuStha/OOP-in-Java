package np.edu.scst.classnobject;
public class House {
    String houseColor;
    static long budget = 50000000;
    public static void main(String[] args) {
        System.out.println("My initial budget is "+ House.budget);
        
        House house1 = new House();
        house1.houseColor = "Blue";
        System.out.println("Color of House 1 is :"+" "+ house1.houseColor);
        House.budget = budget-10000000;
        System.out.println("My budget after building House 1 is"+" "+ House.budget);
        
        House house2 = new House();
        house1.houseColor = "Pink";
        System.out.println("Color of House 2 is :"+" "+ house2.houseColor);
        House.budget =  budget-15000000;
        System.out.println("My budget after building House 2 is"+" "+ House.budget);
        
    }
}
