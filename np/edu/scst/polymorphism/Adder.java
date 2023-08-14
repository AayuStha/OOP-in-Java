package np.edu.scst.polymorphism;

public class Adder {
       public void add(int a , int b){
           System.out.println(a+b);
       }
       public void add(int a , int b, int c){
           System.out.println(a+b+c);
       }
       public static void main(String[] args) {
        Adder a= new Adder();
        a.add(10,20);
        a.add(10,20,30);// compile time polymorphism
    }
}
