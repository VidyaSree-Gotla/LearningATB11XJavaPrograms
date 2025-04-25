package ex_22_Collection_FrameWork_DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Array_Deque {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(15);
        deck.push(10);
        deck.push(5);;
        System.out.println(deck); //Naturally sorted order
    }
}
