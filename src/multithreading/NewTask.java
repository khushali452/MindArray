package multithreading;

class WorkingThread extends Thread {

    private boolean limit = false;

    @Override
    public void run() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Elements of array");
        for (int i = 0; i < arr.length; i++) {
            if (limit) {
                System.out.println("Time's up");

                break;
            }
            System.out.println(arr[i]);
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                e.printStackTrace();
            }
        }

    }

    public void stopThread() {
        limit = true;

    }
}

class MonitoringThread extends Thread{

    private WorkingThread workingThread;

    public MonitoringThread(WorkingThread workingThread) {
        this.workingThread = workingThread;
    }

    @Override
    public void run() {
        try{
            //sleeping thread upto timeout duration
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Time completed");
        workingThread.stopThread();
        workingThread.interrupt();
    }
}
class Main{
    public static void main(String[] args){
        WorkingThread workingThread = new WorkingThread();
        MonitoringThread monitoringThread = new MonitoringThread(workingThread);

        monitoringThread.start();
        workingThread.start();
        try{
            workingThread.join();
            monitoringThread.join();
        }
        catch (InterruptedException e){

        }
    }


}

