package multithreading;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

class Computation1 implements Runnable{

    public static int product =0;
    @Override
    public void run() {
        product= 2*3;
        try{
            CyclicBarrierExample.barrier.await();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Computation2 implements Runnable{
    public static int sum = 0;
    @Override
    public void run() {
        System.out.println("Is the barrier broken? - " + CyclicBarrierExample.barrier.isBroken());
        sum = 10 + 20;

        try{
            CyclicBarrierExample.barrier.await(3000, TimeUnit.MILLISECONDS);
            System.out.println("Number of parties waiting at the barrier "+
                    "at this point = " + CyclicBarrierExample.barrier.getNumberWaiting());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
public class CyclicBarrierExample implements Runnable{
 public static CyclicBarrier barrier= new CyclicBarrier(3);

    @Override
    public void run() {
        System.out.println("Number of parties required to trip the barrier = "+
                barrier.getParties());
        System.out.println("Sum of product and sum = " + (Computation1.product +
                Computation2.sum));

        Computation1 comp1 = new Computation1();
        Computation2 comp2 = new Computation2();

        // creation of child thread
        Thread t1 = new Thread(comp1);
        Thread t2 = new Thread(comp2);

        // moving child thread to runnable state
        t1.start();
        t2.start();

        try
        {
            CyclicBarrierExample.barrier.await();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // barrier breaks as the number of thread waiting for the barrier
        // at this point = 3
        System.out.println("Sum of product and sum = " + (Computation1.product +
                Computation2.sum));

        // Resetting the newBarrier
        barrier.reset();
        System.out.println("Barrier reset successful");
    }



    public static void main(String[] args) {
        CyclicBarrierExample c1 = new CyclicBarrierExample();
        Thread t1 = new Thread(c1);
        t1.start();
    }
}
