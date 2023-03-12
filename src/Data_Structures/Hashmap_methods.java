package Data_Structures;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_methods {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        map.put("F",6);

        HashMap<String,Integer> map1 = new HashMap<>();

        map1.put("G",7);
        map1.put("H",8);
        map1.put("I",9);

        map.putAll(map1);
        map.putIfAbsent("J",7);


        System.out.println(map);

        //computeifpresent
        map.computeIfPresent("J",(k,v) -> v+1);
        System.out.println(map);

        map.computeIfAbsent("K",k -> 6+3);
        System.out.println(map);

        map.compute("K",(k,v)-> v+1);

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue(2));
        System.out.println(map.hashCode());
        System.out.println(map.replace("A",20));

        map1.put("A",45);

        map.forEach((k,v)->map1.merge(
                k,
                v,
                (v1,v2)
                ->v1.equals(v2)? v1
                        : v1 + 10
        ));
        System.out.println(map1);




    }
}
