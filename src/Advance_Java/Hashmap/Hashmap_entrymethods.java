package Advance_Java.Hashmap;
import java.util.*;

public class Hashmap_entrymethods {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");

        Set s = map.keySet();

        System.out.println(s);

        Collection c = map.values();

        System.out.println(c);

        Set s1 = map.entrySet();

        System.out.println(s1);

        Iterator itr = s1.iterator();

        while(itr.hasNext()){

            Map.Entry m1= (Map.Entry)itr.next();

            System.out.println(m1.getKey()+" "+m1.getValue());

            if(m1.getKey().equals(1)){
                m1.setValue("B");
            }

        }

        System.out.println(map);

    }
}
