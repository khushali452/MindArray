package multithreading;

public class Test extends Thread{

    public synchronized void start(){
        System.out.println("stat");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {
        Test th = new Test();
        th.start();

    }
}
