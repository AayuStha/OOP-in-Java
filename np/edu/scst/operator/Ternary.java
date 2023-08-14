package np.edu.scst.operator;
public class Ternary {
    public static void main(String[] args) {
        //(condition)? firstValue : secondValue;
        int age = 18;
        String canVote = (age>=18)? "can vote":"cannot vote";
        System.out.println(canVote); //can vote
    }
}
