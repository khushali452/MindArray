package multithreading;

//1] By Extending Thread class
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread created by extending thread class");
    }
}

//2] By implementing Runnable class
class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread created by implementing Runnable interface");
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();

        Thread th2 = new Thread("THread class thread");
        th2.start();

// getting the thread name by invoking the getName() method
        String str = th2.getName();
        System.out.println(str);


        MyThread2 obj = new MyThread2();
        Thread t2 = new Thread(obj);

        t2.start();

        Runnable r1 = new MyThread2();

// creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(r1, "My new thread");
        th1.start();

// getting the thread name by invoking the getName() method
        String str1 = th1.getName();
        System.out.println(str1);
    }
}
