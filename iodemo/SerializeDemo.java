package iodemo;
import java.io.*;
class Game implements Serializable{
    String player;
    int score;  
    public Game(String player, int score){
        this.player = player;
        this.score =  score;
    }
}
public class SerializeDemo {
    public static void main(String[] args) throws Exception{
        Game g = new Game("Aayush", 21);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("save.txt"));
        oos.writeObject(g);
        oos.close();
    }
}
