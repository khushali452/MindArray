package Advance_Java.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_methods {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        Queue<String> queu = new LinkedList();

        //returns null
        System.out.println(queu.poll());

        //throws errorin case of null queue
        //System.out.println(queu.remove());


    }
}
