package swingdemo;
import javax.swing.*;
public class HelloWorld extends JFrame{
    HelloWorld(){
        setVisible(true);
        setSize(450,450);
        setDefaultCloseOperation(3);
        setTitle("Marvel");
    }
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
    }
}
