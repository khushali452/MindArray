package multithreading;

class ThreadPr extends Thread{

    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
public class ThreadPriority {
    public static void main(String[] args) {

        ThreadPr th = new ThreadPr();

        System.out.println("child thread priority : "+th.getPriority());

        ThreadPr th2 = new ThreadPr();
        //th2.setPriority(10);

        //DEFAULT priority of ONLY main thread is 5
        System.out.println("main thread priority : "+Thread.currentThread().getPriority());

        //but for remaining threads default priority will be inherited from parent to child

        th.setPriority(7);

        th.setName("Childd#################");
        th2.setName("Child2**********************");

        System.out.println("child thread priority :"+th.getPriority());

        //gives runtime exception : Illegal argument exception
        th2.setPriority(10);

        th.start();
        th2.start();

        for(int i = 0;i<5;i++){
            System.out.println("parent thread");
        }


    }
}
