package Data_Structures.Hashmap;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHMap {
    // Refers to the max size of the map following which
    // the removal takes place of the eldest entry
    private static final int MAX = 6;
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lmap = new LinkedHashMap<>() {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > MAX;
            }
        };

        lmap.put(101,"Amit");
        lmap.put(102,"Vijay");
        lmap.put(103,"Rahul");

        for(Map.Entry<Integer,String> entry : lmap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        lmap.put(104,"Aamit");
        lmap.put(105,"Viijay");
        lmap.put(106,"Raahul");
        lmap.put(107,"Amitaa");

        //Displaying the map after adding one more element than max , which will remove the eldest , i.e the first element
        System.out.println(lmap);

    }
}
