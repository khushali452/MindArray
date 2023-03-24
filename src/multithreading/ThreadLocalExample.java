package multithreading;

class Customthread extends Thread {
     Integer cudtId = 0;

    private  ThreadLocal t1 = new ThreadLocal() {

        @Override
        protected Integer initialValue() {
            return ++cudtId;
        }

        ;
    };


    Customthread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + t1.get());
    }
}


public class ThreadLocalExample {
    public static void main(String[] args) {

        Customthread c1 = new Customthread(" customer thread 1");
        Customthread c2 = new Customthread(" customer thread 2");

        Customthread c3= new Customthread(" customer thread 3");

        Customthread c4 = new Customthread(" customer thread 4");

        c1.start();
        c2.start();
        c3.start();
        c4.start();




    }
}
