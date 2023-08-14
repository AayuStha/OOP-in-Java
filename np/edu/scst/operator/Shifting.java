package np.edu.scst.operator;
        public class Shifting {
            public static void main(String[] args) {
                //signed : left shift=multiply by 2, right shift = division by 2
                //unsigned : doesnot preserve sign
                byte a = 30;
                byte b = -31;
                System.out.println(a<<2);  
                System.out.println(a>>>2);
                System.out.println(a>>2);
                System.out.println((byte)(b>>>2)); //Type-casting 
                System.out.println(b>>2);
            }
        }
                  