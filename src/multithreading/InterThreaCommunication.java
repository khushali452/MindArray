package multithreading;

class ThreadB extends Thread{
    int total =0;

    @Override
    public void run() {

        synchronized (this) {

            System.out.println("child thread starts calculation");

            for (int i = 0; i < 10; i++) {
                total = total + i;
            }

            System.out.println("child thread will next execute to give notiication");
            this.notify();
        }
    }
}
public class InterThreaCommunication {
    public static void main(String[] args) throws InterruptedException{

        ThreadB thb = new ThreadB();

        thb.start();

        synchronized (thb){

            System.out.println("main thread trying to call wait method");

            //here if we use sleep method then it is not sure that how much time will it take to complete execution of task
            //if we use join method here , then the task will be completed but the other threads will have to wait for so long
            // here wait will release object level lock and move the main thread nto waiting state while threadB completes its execution
            thb.wait();

            //main thread will get the lock back while threadb notifies main thread about completion of that particular task
            System.out.println("main thread got notification");

            System.out.println(thb.total);

        }


    }
}
