package core_java;

public class Exception_propagation {

    void m1(){
        int data = 10/0;
    }

    void m2(){
        m1();
    }

    void m3(){
        try{
            m2();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        Exception_propagation obj = new Exception_propagation();

        // here first of all m3 is pushed onto stack , over which m2 and m1 will be called respectively .
        // And then exception will be encounter in m1 . and then it drops down the call stack to the previous method.
        obj.m3();
        //In the above example exception occurs in the m1() method where it is not handled,
        // so it is propagated to the previous m2() method where it is not handled, again
        // it is propagated to the m3() method where exception is handled.
        System.out.println("normal flow");
    }
}
