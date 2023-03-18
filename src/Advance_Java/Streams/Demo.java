package Advance_Java.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        HashMap<Integer, ArrayList<Integer>> map= new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,6,7,8,9,10));

        map.put(1, arr);
        map.put(2,arr);
        map.put(3,arr);
        map.put(4,arr);
        map.put(5,arr);
        map.put(6,arr);
        map.put(7,arr);
        map.put(8,arr);
        map.put(9,arr);
        map.put(10,arr);

        //System.out.println(map);

        Map<Integer, List<Integer>> smap = map
                .entrySet()
                .stream()
                .filter(e ->e.getKey()%2==0)
                .collect(Collectors.toMap(Map.Entry::getKey, s->s.getValue()));

        System.out.println(smap);



    }
}
