package Data_Structures.Hashmap;

import java.util.*;
public class Spilterator {
    public static void main(String[] args) {
        HashSet <Integer> hashSetObject = new HashSet <>();
        hashSetObject.add(45);
        hashSetObject.add(-67);
        hashSetObject.add(98);
        Spliterator<Integer> s = hashSetObject.spliterator();
        System.out.println("spliterator of HashSet is: "+s);
    }
}