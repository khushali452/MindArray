package Data_Structures.Lists;

import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String>  llist = new LinkedList<>();

        //add
        llist.add("A");
        llist.add("B");
        llist.add("C");
        llist.add("D");
        llist.add("E");
        llist.add("F");

        System.out.println(llist);

        ArrayList<String> alist = new ArrayList<>();
        alist.add("H");
        alist.add("I");

        //addAll
        llist.addAll(alist);

        System.out.println("after adding elements of Arraylist"+llist);

        //contains
        boolean ret_value = llist.contains("G");
        if(ret_value){
            System.out.println("G present");
        }else{
            System.out.println("G not present");
        }
        //get and set method

        System.out.println(llist.get(3)+" "+llist.getFirst()+" "+llist.getLast());
        llist.set(1,"K");

        //traverse in reverse order

        Iterator i = llist.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


        System.out.println("hi");
        llist.removeFirst();
        llist.remove(0);


    }
}
