package Data_Structures.Sets;

import java.util.HashSet;
import java.util.TreeSet;

public class Treeset_method {
    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();

        //here if we add any value after null, treeset will compare that value to null as it sorts in tree structure
        //and as null cannot be compared to any value it wil give null pointer exception
        //set.add(null);

        set.add(1);
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Lowest Value: "+set.pollFirst());
        System.out.println("Highest Value: "+set.pollLast());

        TreeSet tset =new TreeSet<>();

        tset.add("A");
        tset.add("B");
        tset.add("C");
        tset.add("D");
        tset.add("E");
        System.out.println("Initial Set: "+tset);

        System.out.println("Reverse Set: "+tset.descendingSet());

        System.out.println("Head Set: "+tset.headSet("C", true));

        System.out.println("SubSet: "+tset.subSet("A", false, "E", true));

        System.out.println("TailSet: "+tset.tailSet("C", false));

        System.out.println("Intial Set: "+set);

        System.out.println("Head Set: "+set.headSet("C"));

        System.out.println("SubSet: "+set.subSet("A", "E"));

        System.out.println("TailSet: "+set.tailSet("C"));
    }

}
