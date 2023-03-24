package multithreading;

public class Deadlock {

    public static void main(String[] args) {

        final String resource1 = "qwe";

        final String resource2 ="asd";

        Thread t1 = new Thread() {

            @Override
            public void run() {

                //resource 1 is locked here and while sleep of thread 1 , thread 2 will be executed
                synchronized (resource1) {
                    System.out.println("locked resource 1 by thread 1");

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ie) {
                    }

                    //at this line the deadlock occurs
                    //after sleep of thread 2 the execution comes at this line and as it requires resource 2 but it is already locked by thread2 .hence deadlock occurs
                    synchronized (resource2) {
                        System.out.println(" locked resource by thread 1 ");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {

                //while sleep of thread 1 thread 2 will be executed and thread 2 will lock resource2
                synchronized (resource2){
                    System.out.println(" locked resource2 by thread 2");

                    try {
                        Thread.sleep(200);
                    }catch (InterruptedException ie){

                    }
                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
