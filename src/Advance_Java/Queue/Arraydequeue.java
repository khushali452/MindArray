package Advance_Java.Queue;

import java.util.ArrayDeque;

public class Arraydequeue {
    public static void main(String[] args) {
        ArrayDeque<String> adq= new ArrayDeque<>();

        adq.add("asd");
        adq.add("qwe");
        adq.add("zxc");
        adq.add("qaz");
        adq.add("xsw");
        adq.add("cde");

        System.out.println(adq.offerFirst("Aaa"));
        System.out.println(adq.getLast());
        System.out.println(adq.getFirst());

        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        System.out.println(adq);

    }
}
