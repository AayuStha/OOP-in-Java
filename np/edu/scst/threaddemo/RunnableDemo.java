package np.edu.scst.threaddemo;
//1. implement Runnable interface
//2. override run method
//3. create object of the child class
//4. pass child class object to thread's constructor
//5. call start method of the thread class
public class RunnableDemo implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i am from thread");
            try{ Thread.sleep(1000);}catch(Exception e ){}
        }
    }
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread t = new Thread(runnableDemo);
        t.start();
          for (int i = 0; i < 10; i++) {
            System.out.println("i am from main");
            try{ Thread.sleep(1000);}catch(Exception e ){}
        }
    }
    
}
