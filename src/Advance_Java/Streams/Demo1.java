package Advance_Java.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        Map<Integer, Map<String,String >> map =new HashMap<>();

        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        map1.put("a","abc");
        map1.put("b","bcd");
        map2.put("c","cde");
        map2.put("d","def");

        map.put(1,map1);
        map.put(2,map2);

        Map<String,String> smap= map.entrySet().stream().flatMap(entry ->entry.getValue().entrySet()
                .stream()).collect(Collectors.toMap(x->x.getKey(),y->y.getValue()));



        System.out.println(smap);
    }
}
