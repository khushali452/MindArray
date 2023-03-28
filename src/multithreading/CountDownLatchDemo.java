package multithreading;

import java.util.concurrent.CountDownLatch;

class Worker extends Thread{
    private int delay;
    private CountDownLatch latch;

    public Worker(int delay ,CountDownLatch latch , String name ){
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(200);
            latch.countDown();


            System.out.println(Thread.currentThread().getName()+" : finished");
            System.out.println(latch.getCount());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(4);

        Worker w1 = new Worker(100 , latch,"Worker 1");
        Worker w2 = new Worker(100 , latch,"Worker 2");
        Worker w3 = new Worker(100 , latch,"Worker 3");
        Worker w4 = new Worker(100 , latch,"Worker 4");
        Worker w5 = new Worker(100 , latch,"Worker 4");


        w1.start();
        System.out.println(latch.getCount());
        w2.start();
        w3.start();
        w4.start();
        w5.start();

        // The main task waits for four threads
        latch.await();
        System.out.println(latch.getCount());


        System.out.println(Thread.currentThread().getName() +
                " has finished");
    }
}
