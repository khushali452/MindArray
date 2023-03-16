package Advance_Java.Streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;


//non-terminal operation --> It merely sets a lambda expression on the stream which converts each element to lowercase. The map() method will be covered in more detail later on.
//terminal operation --> This call starts the iteration internally, which will result in each element being converted to lowercase and then counted.
//The conversion part is just there as an example of a non-terminal operation.

public class StreamMethods {
    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>();

        alist.add(10);
        alist.add(15);
        alist.add(35);
        alist.add(30);
        alist.add(25);
        alist.add(20);

        ArrayList<String> slist=new ArrayList<>();

        slist.add("asd");
        slist.add("ram");
        slist.add("rahul");
        slist.add("raghu");
        slist.add("shyam");
        slist.add("asd");

        //filter method
        List<Integer> l1 = alist.stream().filter(I -> I%2==0).collect(Collectors.toList());

        System.out.println(l1);

        //sorted method
        List<Integer> l4 = alist.stream().sorted().toList();

        System.out.println(l4);
        //map
        List<String> l2= slist.stream().map(s -> s.toUpperCase()).toList();

        System.out.println(l2);

        //The Java Stream distinct() method is a non-terminal operation that returns a new Stream
        // which will only contain the distinct elements from the original stream. Any duplicates will be eliminated.
        //distinct
        List<String> l3 =slist.stream().distinct().toList();

        System.out.println(l3);

    }
}
