package multithreading;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("child method");
    }
}
public class StartRunExamples {
    public static void main(String[] args) {

        MyRunnable r =new MyRunnable();
        Thread t1 = new Thread();
        Thread t2 = new Thread(r);

        //Creates new Thread with thread class start method
        t1.start();

        //This method is run by the thread when it executes. Subclasses of Thread may override this method.
        //This method is not intended to be invoked directly. If this thread is a platform thread created with a Runnable task then invoking this method will invoke the task's run method. If this thread is a virtual thread then invoking this method directly does nothing.
        //Implementation Requirements:
        //The default implementation executes the Runnable task that the Thread was created with. If the thread was created without a task then this method does nothing.
        t1.run();

        //new thread will be created and start method of runnable interface will be invoked
        t2.start();

        //no new thread creation just invoke overrided run method just like a normal method call
        t2.run();

        //no new thread will be created eun method will be called just like a normal method call
        r.run();

        //gives compliation error : symbol not found bcz runnable interface do not have start method
        //r.start();
    }
}
