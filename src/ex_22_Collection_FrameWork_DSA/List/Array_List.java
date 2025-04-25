package ex_22_Collection_FrameWork_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    //The ArrayList class is a resizable array, which can be found in the java.util package.
    //The difference between a built-in array and an ArrayList in Java, is that
    // the size of an array cannot be modified (if you want to add or remove elements to/from an array,
    // you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pramod");
        arrayList.add(null);
        arrayList.add("dutta");
        arrayList.add("dutta"); // Duplicate is allowed.
        arrayList.add(123); // Different data type is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());

    }
}
