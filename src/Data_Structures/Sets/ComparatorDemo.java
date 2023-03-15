package Data_Structures.Sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class mycomparator implements Comparator{

    public int compare(Object o1,Object o2){
        Integer i = (Integer) o1;
        Integer j = (Integer)  o2;

        if(i<j){
            return 1;
        }else if(i>j){
            return -1;
        }else{
            return 0;
        }
    }

}
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();
        //TreeSet<Integer> alist = new TreeSet<>(new mycomparator());

        alist.add(10);
        alist.add(2);
        alist.add(90);
        alist.add(12);
        alist.add(2);

        Collections.sort(alist, new mycomparator());


        System.out.println(alist);

    }
}
