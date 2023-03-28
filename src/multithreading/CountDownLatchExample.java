package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch count = new CountDownLatch(5);
        new Thread(new Service(count,2)).start();
        new Thread(new Service(count,4)).start();

        new Thread(new Service(count,5)).start();



    }

    static class Service implements Runnable{

        private CountDownLatch count;
        private int WaitTime;

        public Service(CountDownLatch count ,int WaitTime){
            this.count = count;
            this.WaitTime = WaitTime;
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" started");

            try {
                TimeUnit.SECONDS.sleep(WaitTime);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("task completed by "+Thread.currentThread().getName() );
            count.countDown();
        }
    }
}
