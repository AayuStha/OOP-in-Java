package np.edu.scst.accessmodifier.pack1;
public class SameClassSamePackage {
    public int publicVar = 10                                                                                                                                                                        
    int defaultVar= 20;//default
    protected int protectedVar =30;
    private int privateVar = 40;
        public static void main(String[] args) {
            SameClassSamePackage s = new SameClassSamePackage();
            System.out.println(s.publicVar);
            System.out.println(s.defaultVar);
            System.out.println(s.protectedVar);
            System.out.println(s.privateVar);
    }
}


