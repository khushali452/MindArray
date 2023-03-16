package Advance_Java.Iterators;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class FailSafeItr {
    public static void main(String[] args)
    {

        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map
                = new ConcurrentHashMap<String, Integer>();

        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);

        // Getting an Iterator from map
        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            String key = (String)it.next();
            System.out.println(key + " : " + map.get(key));

            // This will reflect in iterator.
            // Hence, it has not created separate copy
            //it will not through exception as it is weakly consistent
            map.put("SEVEN", 7);
        }
    }
}