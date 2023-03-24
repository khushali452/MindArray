package multithreading;
class newthread extends Thread
{
    Thread t;
    String name;
    newthread(String threadname)
    {
        name = threadname;
        t = new Thread(this,name);
        t.start();
    }
    public void run()
    {
        try {
//            Thread.sleep(3000);
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("running");
    }

}
class multithreaded_programing
{
    public static void main(String args[])
    {
        newthread obj1 = 	 new newthread("one");
        //newthread obj2 =	 new newthread("two");

        System.out.print(obj1.t.isAlive());

        try
        {
            //obj1.t.wait();
            System.out.print(obj1.t.isAlive());
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}