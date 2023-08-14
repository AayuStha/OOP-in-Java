package np.edu.scst.threaddemo;
public class InnerDemo {
    public static void main(String[] args) {
       Thread t1 = new Thread(){
           public void run() {
               for (int i = 0; i < 10; i++) {
                   System.out.println("i am from thread1");
                   try { Thread.sleep(1000); } catch (Exception e) {}
               }
           }
       };
                Thread t2 = new Thread(){
           public void run() {
               for (int i = 0; i < 10; i++) {
                   System.out.println("i am from thread2");
                      try { Thread.sleep(1000); } catch (Exception e) {}
               }
           }
       } ;
                t1.start();
                t2.start();
       
       
    }
}
