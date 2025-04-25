package ex_22_Collection_FrameWork_DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Example {
    //In JavaScript, a Map is a built-in object that stores key-value pairs, similar to objects.
    // However, unlike objects, Map allows keys of any data type, including objects and functions.
    // It also maintains the insertion order of elements.
    //Map cannot contain duplicate keys and each key can map to atmost one value
    public static void main(String[] args) {
        Map m1 = new HashMap(); //allow null key and null value
        m1.put("name","pramod");
        m1.put("rollno",1);
        m1.put("phone",987654321);
        System.out.println(m1);

        Map m2 = new LinkedHashMap(); //allow null key and null value
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);

        Map m3 = new TreeMap();//DONOT allow null key and null value
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m3.put("firstname","pramod");
        m3.put("lastname","dutta");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);
        // {phone=987654321, name=pramod, rollno=1}
    }
}
