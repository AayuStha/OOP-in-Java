package mapdemo;
import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //syntax:
        //LinkedHashMap<ClassName, ClassName> lhm = new LinkedHashMap();
        //Map<ClassName, ClassName> lhm = new LinkedHashMap();\
        
        //initialize
        LinkedHashMap<String, String> lhm = new LinkedHashMap();
        //insert values
        lhm.put("apple", "a type of fruit");
        lhm.put("ball", "a type of toy");
        lhm.put("cat", "a type of animal");
        
        //print 
        System.out.println(lhm); //{apple=a type of fruit, ball=a type of toy, cat=a type of animal}
        //getting a single value
        System.out.println(lhm.get("ball")); // a type of toy
        
        
        //iterating
        for(String var: lhm.keySet()){
            System.out.println(var+ ":" + lhm.get(var));
        }

    }
}
