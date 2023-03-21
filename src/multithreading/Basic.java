package multithreading;

import java.util.Map;

class MyThread extends Thread{
    public void run(){
        System.out.println("thread name : "+Thread.currentThread().getName());
        for(int i =0;i<10;i++){
            System.out.println("child thread");
        }
    }
}
public class Basic {
    public static void main(String[] args) {
        MyThread t =new MyThread();
        t.start();
        for(int i =0;i<10;i++){
            System.out.println("main thread");
        }

        //get and change name of thread main

        System.out.println("thread name : "+Thread.currentThread().getName());
        Thread.currentThread().setName("main_changed");
        System.out.println("thread name : "+Thread.currentThread().getName());

    }
}
