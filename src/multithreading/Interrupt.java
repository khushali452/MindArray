package multithreading;

class InterruptThread extends Thread{

    @Override
    public void run() {

        try {

            for (int i = 0; i < 5; i++) {

                System.out.println("I am a lazy thread");

                Thread.sleep(2000);
            }
        }catch (InterruptedException ie){

            System.out.println("i got interrupted");
        }
    }
}
public class Interrupt {

    public static void main(String[] args) {

        InterruptThread th = new InterruptThread();

        th.start();

        //here main thread interrupts child thread .IN this case output is execution of
        //main thread beginning of child thread and stop after getting interrupted
        th.interrupt();

        System.out.println("end of main thread");
    }
}

//whenever we call enter interrupt method , if the thread is not in sleeping or waiting state then
// interrupt call will not impact the thread but it will wait for thread to come in sleeping or waiting state and will interrupt finally
//Hence Interrupt call is never wasted

// if interrupt is called but the thread never goes into sleeping or waiting state then
// it is the only case where interrupt call gets wasted and makes no impact on the execution