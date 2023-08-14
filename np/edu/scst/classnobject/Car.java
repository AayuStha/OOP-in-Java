package np.edu.scst.classnobject;
public class Car {
    String modelName;
    int mileage;
    static int count;
    
    //default constructor - those blank constructors which are inserted into code by 
    //java during compilation, if no other constructor are present
    
    Car(){                      //constructor - parameterless constructor
        System.out.println("car no "+ count + " is created");
        count++;
    }
    Car(String m, int mile){    // parametarized constructor
        this();
        modelName=m;
        mileage= mile;
    }
    //rules for calling another constructor of the same class
    //call another sonstructor using 'this' keyword 
    //the call should be on the first line
    
    public static void main(String[] args) {
        Car c1= new Car("Toyota", 20);
        Car c2 = new Car("Honda", 15);
    }
}
