package np.edu.scst.threaddemo;
public class ThreadProperties {
    //name
    //priority
    public static void main(String[] args) {
        Thread t1 = new Thread("name1"){
            public void run(){
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
            }
        };
         Thread t2 = new Thread(){
            public void run(){
                System.out.println(Thread.currentThread().getName());//Thread-0
                System.out.println(Thread.currentThread().getPriority());
            }
        };
         //Thread.MIN_PRIORITY = 1
         //Thread.NORM_PRIORITY= 5
         //Thread.MAX_PRIORITY =10
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
         t1.start();
         t2.start();
         Thread.currentThread().setName("fancy name");
         System.out.println(Thread.currentThread().getName());//fancy name
       
    }
}
