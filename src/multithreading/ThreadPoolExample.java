package multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {

        System.out.println("Inside : "+Thread.currentThread().getName());

        System.out.println("Creating Executor Service with a thread pool of Size 2");

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task1 = () ->{
            System.out.println("Executing task 1 inside : "+Thread.currentThread().getName());

            try{
                TimeUnit.SECONDS.sleep(2);
            }catch(InterruptedException ie){
                throw new IllegalStateException(ie);
            }
        };

        Runnable task2 = () ->{
            System.out.println("Executing task 2 inside : "+Thread.currentThread().getName());

            try{
                TimeUnit.SECONDS.sleep(2);
            }catch(InterruptedException ie){
                throw new IllegalStateException(ie);
            }
        };

        Runnable task3 = () ->{
            System.out.println("Executing task 3 inside : "+Thread.currentThread().getName());

            try{
                TimeUnit.SECONDS.sleep(2);
            }catch(InterruptedException ie){
                throw new IllegalStateException(ie);
            }
        };

        //When a new task is submitted, the executor service picks one of the available threads from the pool and executes the task on that thread.
        // If we submit more tasks than the available
        // number of threads and all the threads are currently busy executing the existing tasks,
        // then the new tasks will wait for their turn in a queue.

        System.out.println("Submitting the tasks for execution...");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();
    }
}
