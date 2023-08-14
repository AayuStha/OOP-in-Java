package np.edu.scst.array;
public class ArrayDemo {
    public static void main(String[] args) {
        int a[] = {10,20,30};
        //          0  1  2
        System.out.println(a[1]);
        // a[3]=40; // ArrayIndexOutofBoundsException
        
        a[2]=50;
        System.out.println(a[2]); // 50
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]); // 10 20 50
        }
        
        int[]b={1,2,3};
        int[]c= new int[3];
        System.out.println(c[1]);
        
        boolean g[] = new boolean [3];
        System.out.println(g[2]);
        g[1]= false;
        System.out.println(g[1]);
        
        char s[] = new char [3];
        System.out.println(s[1]);
        s[1]= 'A';
        System.out.println(s[1]);
        
        //foreach loopin JAVa
        //for [datatypeof-Arrayorcollecyion temporaryVariableName : variableOfArray]
        
        for(float var: c){
            System.out.println(var);
            
            //jagged array : multidimensional array
            int[][]multi = { {1,2}, {3,4} };
        }
        
    }
}
