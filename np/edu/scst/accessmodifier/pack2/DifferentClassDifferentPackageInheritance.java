package np.edu.scst.accessmodifier.pack2;

import np.edu.scst.accessmodifier.pack1.SameClassSamePackage;

public class DifferentClassDifferentPackageInheritance extends SameClassSamePackage{
    public static void main(String[] args) {
        SameClassSamePackage s = new SameClassSamePackage();
        System.out.println(s.publicVar);
        System.out.println(s.defaultVar);
        System.out.println(s.protectedVar);
        System.out.println(s.privateVar);
        
        DifferentClassDifferentPackageInheritance c = newDifferentClassDifferentPackageInheritance();
        System.out.println(c.protectedVar);
    }
}
