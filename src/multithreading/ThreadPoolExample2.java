package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable2 implements Runnable{

    String name;
    MyRunnable2(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " job started by thread : "+ Thread.currentThread().getName());

        try{
            Thread.sleep(400);
        }catch (InterruptedException ie ){}

        System.out.println(name+" job completed by thread :"+Thread.currentThread().getName());
    }
}
public class ThreadPoolExample2 {
    public static void main(String[] args) {
        MyRunnable2[] jobs = {
                new MyRunnable2("A"),
                new MyRunnable2("B"),
                new MyRunnable2("C"),
                new MyRunnable2("D"),
                new MyRunnable2("E"),
                new MyRunnable2("F"),


        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (MyRunnable2 job : jobs){
            executorService.submit(job);
        }
        executorService.shutdown();
    }


}
