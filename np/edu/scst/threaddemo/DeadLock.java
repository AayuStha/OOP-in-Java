package np.edu.scst.threaddemo;
public class DeadLock {
    public static void main(String[] args) {
        String class1 = "BCA 3rd Sem";
        String class2 = "BCA 5th Sem";
        Thread java = new Thread("Java sir"){
            public void run(){
                synchronized(class1){
                    System.out.println("Java sir taught 3rd sem");
                    try{Thread.sleep(50);}catch (Exception e){}
                    synchronized(class2){
                        System.out.println("Java sir taught 5th sem");
                        try{Thread.sleep(5000);}catch (Exception e){}
                    }
                }
                System.out.println("Java sir ko shift sakyo.");
            }
        };
        Thread dsa = new Thread("DSA sir"){
            public void run(){
                synchronized(class2){
                    System.out.println("DSA sir taught 5th sem");
                    try{Thread.sleep(5000);}catch (Exception e){}
                    synchronized(class1){
                        System.out.println("DSA sir taught 3rd sem");
                        try{Thread.sleep(50);}catch (Exception e){}
                    }
                }
                System.out.println("DSA sir ko shift sakyo.");
            }
        
        };
        java.start();
        dsa.start();
    }
}
