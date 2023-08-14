package np.edu.scst.classnobject;
public class Mobile{
    int model;
    String name;
    static int count;
    Mobile(){
        System.out.println(count + " mobile is created");
        count++;
    }
    Mobile(String m, int mod){
        this();
        name=m;
        model= mod;
    }
    public static void main(String[] args) {  
        
        Mobile iphone = new Mobile("Iphone", 14);
        Mobile samsung = new Mobile("Samsung", 12);
        Mobile nokia = new Mobile("Nokia", 3310);
    } 
}
// create a mobile class named mobile. Crete 3 objects.
//whenever an object is created, print 'X mobile created', where x is the number of mobile.