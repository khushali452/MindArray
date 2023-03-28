package multithreading;

class prblm implements Runnable{
    @Override
    public void run() {
        try {
            // starting time
            long start = System.currentTimeMillis();
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            System.out.println("completed thread1 ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class Task {
    static void runTask(Runnable task, long timeout) {

            //System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {

            Thread t1 = new Thread(new prblm() {
                @Override
                public void run() {

                    System.out.println("weeeeeeeeeeeeee");

                    prblm p = new prblm();

                    Thread t2 = new Thread(p);

                    t2.start();
                }
            });

            t1.start();




        runTask(() -> {new prblm();
        }, 2000);


    }
}
