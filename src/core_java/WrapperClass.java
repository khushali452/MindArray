package core_java;

public class WrapperClass {
    public static void main(String[] args) {
        int a =20;

        //auto boxing ...from primitive dtata type to its wrapper class
        //explicitly autoboxing
        Integer i = Integer.valueOf(a);
        //autoboxing, now compiler will write Integer.valueOf(a) internally
        Integer j = a;

        //unboxing : from wrapper class to primitive datatype

        Integer k = 9;
        int l = k.intValue();
        int m=a;

        System.out.println(k+" "+l+" "+m+" ");
    }
}
