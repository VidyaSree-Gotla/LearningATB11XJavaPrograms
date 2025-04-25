package ex_22_Collection_FrameWork_DSA.List;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    //A linked list is a linear data structure where elements are stored in nodes.
    // Each node contains data and a reference (pointer) to the next node in the sequence.
    // Unlike arrays, linked lists do not store elements in contiguous memory locations,
    // allowing for efficient insertion and deletion of elements at any position.
    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        ll.add("Cat");
        ll.add("Dog");
        ll.addFirst("Elephant");
        ll.addLast("Fox");
        System.out.println("Linked List: " +ll);
        //Accessing Elements
        System.out.println("First Element of Linked List is: "+ll.getFirst());
        System.out.println("Last Element of Linked List is: "+ll.getLast());
        //Removing Elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removing first and last elements linked list is:" + ll);
        System.out.println("Size of the array is: "+ll.size());
        System.out.println("If list contains Cat: "+ll.contains("Cat"));
        System.out.println("Is the list Empty: "+ll.isEmpty());


    }

}
