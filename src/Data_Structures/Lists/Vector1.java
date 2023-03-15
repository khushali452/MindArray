package Data_Structures.Lists;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();

        vec.add("a");
        vec.add("ab");
        vec.add("abc");
        vec.add("abcd");
        vec.add("abc");
        vec.add("ab");

        vec.add(6,"a");

        System.out.println(vec);

        System.out.println(vec.capacity());
        System.out.println(vec.firstElement());
        System.out.println(vec.subList(2,6));
        System.out.println(vec.lastIndexOf("a"));

    }
}
