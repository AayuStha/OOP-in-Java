package np.edu.scst.threaddemo;
public class SyncDemo {
    public static void main(String[] args) {
         String classroom = "third semester";
        Thread java = new Thread("Java sir thread"){
          public void run(){
                synchronized(classroom){
              System.out.println("java sir is taking java class for "+classroom);
              try{Thread.sleep(5000);}catch(Exception e){}
               System.out.println("java sir has finished taking java class");
              }
          }  
        };
         Thread dsa = new Thread("dsa sir thread"){
          public void run(){
                 synchronized(classroom){
              System.out.println("dsa sir is taking dsa class for "+classroom);
              try{Thread.sleep(5000);
              }
              catch(Exception e){}
               System.out.println("dsa sir has finished taking dsa class");
                 }
          }  
        };
         java.start();
         dsa.start();
        
    }
    
}
