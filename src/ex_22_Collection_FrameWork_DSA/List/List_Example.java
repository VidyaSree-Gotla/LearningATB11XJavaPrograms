package ex_22_Collection_FrameWork_DSA.List;

import java.util.List;

public class List_Example {
    //Issue with Arrays
    //> Fixed size, can store homogeneous datatype os elements, Cannot grow size automatically,wastage of memory. So we use lists.
    public static void main(String[] args) {
        //List Fruits = new List();
        List Fruits = List.of("Orange","Apple","Banana","Grapes","Mango");
        System.out.println(Fruits);
        //fruits.add("chiku"); // java.lang.UnsupportedOperationException
        //fruits.remove("apple"); Not Possible
    }

}
