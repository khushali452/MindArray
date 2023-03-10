package Data_Structures;

import java.io.Serializable;
import java.util.*;


public class Array_List {
    public static void main(String[] args)
    {
        ArrayList<String> array = new ArrayList<>();

        //Implements Random access , cloneable , serializable
        System.out.println(array instanceof Serializable);
        System.out.println(array instanceof Cloneable);
        System.out.println(array instanceof RandomAccess);


        array.add("A");
        array.add("B");
        array.add("C");

        System.out.println("list of elements is : "+array);

        array.add("Vijay");
        array.add("Ravi");
        array.add("Ajay");

        Iterator itr=array.iterator();//getting the Iterator
        while(itr.hasNext()) {//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }
            Collections.sort(array);

            array.remove("Vijay");
            array.clear();
            System.out.println("After invoking clear() method: "+array);

    }

}
