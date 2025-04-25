package ex_22_Collection_FrameWork_DSA.List;
import java.util.Stack;
public class stack {
    //The class is based on the basic principle of LIFO (last-in-first-out). Besides the basic push and pop operations,
    // the class also provides three more functions, such as empty, search, and peek.
    //The Stack class extends Vector and provides additional functionality for stack operations, such as push, pop, peek, empty, and search.
    //The Stack class can be considered as a subclass of Vector because it inherits all of its methods and properties.
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.push("Amit2");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);


        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);
    }
}
