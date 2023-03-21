package multithreading;

class JoinThread extends Thread {
    //child thread calls join method on main method hence the child thread will wait for main method to execute
    public static Thread mt;

    @Override
    public void run() {

        try {

            mt.join();

        } catch (InterruptedException ie) {}

        for (int i = 0; i < 5; i++) {

            System.out.println("child thread");
        }
    }
}
public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException{

        //the below thread is run by main thread and calls join method on itelf which causes deadlock
        //Thread.currentThread().join();

        JoinThread.mt = Thread.currentThread();

        JoinThread th = new JoinThread();

        th.start();
        //th.join();  --> deadlock as main thread is already executing and th is waiting for main to complete and here main thread wait until th is completed

        for (int i=0;i<5;i++){
            System.out.println("Main thread exectution");
        }
    }
}

