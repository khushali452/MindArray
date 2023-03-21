package multithreading;

class myThread extends Thread{

    //run method can be overloaded but thread can invoke only rum method with no arguments.
    // If we want to overload run method with args we have to call it explicitly
    public void run(){
        System.out.println("no args run method");
    }
    public void run(int i){
        System.out.println("int args run method");
    }
}

//overriding of run method is necessary.
// if we do not override run method then it will give no output when we cal start method on thread
public class RunOverloading {
    public static void main(String[] args) {

        myThread t1 = new myThread();

        //here run method with no args will be invoked

        t1.start();
    }

}
