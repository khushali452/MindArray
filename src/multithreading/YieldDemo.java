package multithreading;

class Yield_method extends Thread{
    @Override
    public void run() {
        System.out.println("after yield");

        for(int i=0;i<5;i++){
            System.out.println("child thread");

        }
        Thread.yield();
    }
}
public class YieldDemo {
    public static void main(String[] args) {
        Yield_method thread = new Yield_method();

        //thread.setPriority(7);
        thread.start();
        for(int i=0;i<5;i++){
            System.out.println("main thread");

        }


    }
}
