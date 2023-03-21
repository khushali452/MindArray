package multithreading;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class JointThread extends Thread{

    @Override
    public void run() {

        for(int i=0;i<5;i++){

            System.out.println("child thread");

            try{
                Thread.sleep(200);

            }catch (InterruptedException ie){ }

        }

    }
}
public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {

        JointThread th = new JointThread();

        th.start();

        //throws interrupted exception if not handles excpetion in try catch or throws keyword
        //th.join();

        th.join(500);

        for(int i=0;i<5;i++) {

            System.out.println("main thread");

        }

    }
}
