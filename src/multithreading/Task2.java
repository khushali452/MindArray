package multithreading;

class TaskThread extends Thread{
    @Override
    public void run() {
        try{
            long start = System.nanoTime();

            for (int i=0;i<100;i++){
                System.out.println(i);
            }
            long time = System.nanoTime() - start;
            System.out.println(time/1e6);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
public class Task2 {
    public static void main(String[] args) {
        TaskThread th = new TaskThread();
        th.start();
    }
}
