package ex_22_Collection_FrameWork_DSA.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash_Table {
    //Hash table is a legacy class and donot allow neither Null Key no Null Value
    //If duplicates are there they are not considered.
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
//        ht1.put(4, null); // java.lang.NullPointerException
//        ht1.put(null, "three");  // java.lang.NullPointerException
        System.out.println(ht1);
        System.out.println("*********************************************");
        Enumeration<Integer> e  = ht1.keys(); //prints only keys
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());

        }
        System.out.println("*********************************************");
        Enumeration<String> s =ht1.elements();
        while(s.hasMoreElements()){
            System.out.println(s.nextElement());
        }
    }
}
