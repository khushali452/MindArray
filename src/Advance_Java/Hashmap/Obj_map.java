package Advance_Java.Hashmap;

import java.util.*;

class Student{
    int id;
    String name;
    public Student(int id , String name){
        this.id=id;
        this.name=name;
    }
}
public class Obj_map {
    public static void main(String[] args) {

        HashMap<Integer,String> smap = new HashMap<>();

        Student s1 = new Student(1, "khushali");
        Student s2 = new Student(2, "khushal");
        Student s3 = new Student(3,"khush");

        System.out.println(s1.id);
        System.out.println(s1.name);

        smap.put(s1.id,s1.name);
        smap.put(s2.id,s2.name);
        smap.put(s3.id,s3.name);

        HashMap<Student,Map> main_map = new HashMap<>();

        main_map.put(s1,smap);

        for(Map.Entry<Integer,String> entry: smap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println(main_map);

    }

}
