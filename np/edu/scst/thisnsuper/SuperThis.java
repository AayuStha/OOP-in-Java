package np.edu.scst.thisnsuper;
class Parent{
    int p=10;
    Parent (){
        System.out.println("Hello");
    }
}
public class SuperThis extends Parent{
   int c;
   SuperThis(){
       super();
       this.c=super.p;
   }
    public static void main(String[] args) {
        SuperThis s = new SuperThis();
        System.out.println(s);
    }
}
