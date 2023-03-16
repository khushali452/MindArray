package Advance_Java.Sets;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add("A");
        hs.add("A");
        hs.add("J");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        hs.add(null);
        hs.add(null);
        hs.add(10);

        System.out.println(hs);

    }
}
