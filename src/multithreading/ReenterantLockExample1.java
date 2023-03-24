package multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Thread1 extends Thread{
    static ReentrantLock l = new ReentrantLock();

    Thread1(String name){
        super(name);
    }

    @Override
    public void run() {

        if(l.tryLock()){
            System.out.println(Thread.currentThread().getName()+" got the lock and is executing safe operations");

            try{
                Thread.sleep(200);
            }catch (InterruptedException ie){

            }
            l.unlock();
        }
        else {
            System.out.println(Thread.currentThread().getName()+" did not get lock and hence performing some alternative operations");
        }
    }
}

public class ReenterantLockExample1 {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1("deven");
        Thread1 th2 = new Thread1("khushali");



        th2.start();
        th1.start();

    }

}
