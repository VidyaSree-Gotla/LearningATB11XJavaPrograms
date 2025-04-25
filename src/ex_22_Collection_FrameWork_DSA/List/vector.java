package ex_22_Collection_FrameWork_DSA.List;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class vector {
    //The Vector class in Java implements a growable array of objects.
    // Vectors were legacy classes, but now it is fully compatible with collections.
    // It comes under java.util package and implement the List interface.
    public static void main(String[] args) {
      Vector v = new Vector();
      v.add("Birds");
      v.add("Animals");
      v.add(123);
      v.add(true);
      v.add(12.47);
      v.add(null);
      v.add(123);//Vector allows Duplicate values
        System.out.println("Ways to get the elements of Vector");
        System.out.println("**********************************************************");
        System.out.println("1. Using normal Printing technique");
        System.out.println("the Elements in Vector are: "+v);
        System.out.println("**********************************************************");
        System.out.println("Using Normal FOR Loop");
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
        System.out.println("**********************************************************");
        System.out.println("Using FOR EACH Loop");
        for(Object o : v){
            System.out.println(o);
        }
        System.out.println("**********************************************************");
        System.out.println("Using ITERATOR");
        Iterator iterator = v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("**********************************************************");
        System.out.println("Using ENUMERATIONS");
        Enumeration<Object>enem = v.elements();
        while(enem.hasMoreElements()){
            System.out.println(enem.nextElement());
        }
        System.out.println("**********************************************************");
        System.out.println("Using List Iterator");
        ListIterator listiterator = v.listIterator();
        while(listiterator.hasNext()){
            System.out.println(listiterator.next());
        }
        System.out.println("**********************************************************");
        System.out.println("Printing backward using List Iterator");
        System.out.println("Only works if we already parsed to end element of the list previously");
        while(listiterator.hasPrevious()){
            System.out.println(listiterator.previous());
        }


    }
}
