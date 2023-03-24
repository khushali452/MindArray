package multithreading;

class Dthread extends Thread {
    @Override
    public void run() {
        System.out.println("Is a daemon" + Thread.currentThread().getName() + "thread ? " + Thread.currentThread().isDaemon());
        //System.out.println("Thread name : " + Thread.currentThread().getName());

    }
}
public class DaemonThread {

    public static void main(String[] args) throws InterruptedException {

        Dthread dt1 = new Dthread();
        Dthread dt2 = new Dthread();

        dt2.setName("Thread2 ");
        dt1.setName("Thread1 ");

        dt2.setDaemon(true);

        dt1.start();

        //gives illegal thread state exception as it is started as user thread and then set to be daemon
        //dt1.setDaemon(true);
        dt2.start();

        dt2.join();
    }

}
