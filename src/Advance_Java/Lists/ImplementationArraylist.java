package Advance_Java.Lists;

import java.util.*;

public class ImplementationArraylist<E>{

    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public ImplementationArraylist(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }


    private void ensureCapa(){

        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements,newSize);
    }

    @SuppressWarnings("unchecked")
    public E get(int i){
        if(i>= size || i<0){
            throw new IndexOutOfBoundsException("Index "+i+" size "+ i);
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {
        ImplementationArraylist<Integer> list = new ImplementationArraylist<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(6);

        list.get(4);

        System.out.println(list.get(1));

        for(Object i : list.elements ){
            System.out.println(i);

        }



    }


}
