package np.edu.scst.abstraction.multipledemo;
public class Child extends Parent implements GF1, GF2{
    public static void main(String[] args) {
        Child says = new Child();
 //       System.out.println(c.parent);
          Parent talks = new Child();
          System.out.println(talks.parent);
          GF1 talk = new Child();
          System.out.println(talk.parent);
          GF2 shout = new Child();
          System.out.println(shout.parent);
    }
}
