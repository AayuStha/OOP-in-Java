
package np.edu.scst.abstraction;
public abstract class Abstraction {
    public abstract void doThis();
}
class abstracted extends Abstraction{
@Override
public void doThis(){
    System.out.println("Hello");
}
    public static void main(String[] args) {
        abstracted a = new abstracted();
        a.doThis();
        Abstraction b = new abstracted();
        b.doThis();
    }
}
