package Advance_Java.ConcurrentCollections;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Concurrentlinkedqueue {
    public static void main(String[] args) {
        int j =1;
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
        for (int i = 1; i <=5; i++) {
            //  Adding items to the tail of this queue
            queue.add(i);}
        //inserts the element at the tail of this queue
        queue.offer(6);
        System.out.println("Queue : "+queue);
        //Returns true if this queue contains the specified element
        if(queue.contains(4)){
            System.out.println("This queue conatins 4");
        }
        else{
            System.out.println("4 is absent");
        }
        //returns true if the queue is empty
        if(queue.isEmpty()){
            System.out.println("Add some elements because the queue is empty.");
        }
        else{
            System.out.println("Queue is not empty");
        }
    }
}
