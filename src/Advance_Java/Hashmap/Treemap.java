package Advance_Java.Hashmap;

import java.util.Comparator;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {

        TreeMap<String,Integer> tmap = new TreeMap<>(new comparator());

        tmap.put("Amit",1);
        tmap.put("Vijay",2);
        tmap.put("Rahul",3);
        tmap.put("Raghu",4);
        tmap.put("Raju",5);

        System.out.println(tmap.lastEntry());
        System.out.println(tmap.headMap("Rahul"));
        System.out.println(tmap.tailMap("Rahul"));
        System.out.println(tmap);
    }
}

class comparator implements Comparator{
    public int compare(Object o1, Object o2){
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);
    }
}
