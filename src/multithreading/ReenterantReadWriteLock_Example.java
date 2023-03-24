package multithreading;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite{
    private final Map<String,String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void putString(String key, String value){
        //System.out.println(Thread.currentThread().getName()+" - is writing");
        rwl.writeLock().lock();
        try{
//            System.out.println(Thread.currentThread().getName()+" - is writing");
            map.put(key,value);
            Thread.sleep(200);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            rwl.writeLock().unlock();
        }
    }

    public Set<String> allKeys(){
        rwl.readLock().lock();
        try {
             return map.keySet();
        }finally {
            rwl.readLock().unlock();
        }
    }
}
public class ReenterantReadWriteLock_Example {
    public static void main(String[] args) {

        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(rwl);

        Runnable writer =() ->{
            for (int i=0;i<20;i++){
                mapReadWrite.putString(String.valueOf(i),String.valueOf(i));

            }
            System.out.println("Written by "+Thread.currentThread().getName() );
        };

        Runnable reader = () ->{
          if(rwl.isWriteLocked()){
              System.out.println("Write locked by : "+Thread.currentThread().getName());
          }rwl.readLock().lock();
            System.out.println("Got the read lock !");
            try{
                System.out.println(Thread.currentThread().getName()+" "+mapReadWrite.allKeys());
            }finally {
                rwl.readLock().unlock();
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);

        t1.start();
        t2.start();
        t3.start();


    }

}
