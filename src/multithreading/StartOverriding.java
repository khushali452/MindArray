package multithreading;

class Threaddemo extends Thread{
    public void run(){
        System.out.println("run method");
    }
    //here we are not giving the chance of start method of Thread class.
    //hence the overloaded start method will be called just as a normal overrided method.
    //thread will not be created
    public void start(){
        //if we call super.start then the new child thread will be created which will invoke
        // run method and hence run method will be executed by new created thread
        super.start();
        //the overrided method will be loaded by main thread
        System.out.println("start method");
    }
}
public class StartOverriding {
    public static void main(String[] args) {

        Threaddemo t = new Threaddemo();
        t.start();
        //executed by main thread
        System.out.println("main method");
    }

}
