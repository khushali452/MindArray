package Advance_Java.Iterators;
import java.util.*;
public class failFast {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        ListIterator<Integer> itr1= al.listIterator();
        Iterator<Integer> itr = al.iterator();
        while (itr1.hasNext()) {
            if (itr1.next() == 2) {
                // will not throw Exception
                itr1.add(499);
            }
        }

        al.add(100);

        System.out.println(al);

        itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 3) {
                // will throw Exception on
                // next call of next() method
               // al.remove(3);
            }
        }
    }
}
