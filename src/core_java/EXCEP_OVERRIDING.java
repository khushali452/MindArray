package core_java;

import java.io.*;

class parent1{
    void msg() throws ArithmeticException{
        System.out.println("parent method");
    }
}


class child1 extends parent1{
    //void msg() throws Exception{}
    //this gives error as we cannot throw parent class exception of superclass in subclass


    //If the superclass method declares an exception,
    //subclass overridden method can declare the same subclass exception , unchecked exception or no exception but cannot declare parent exception.
    void msg() throws ArithmeticException{
        System.out.println("child method");
    }
}
public class EXCEP_OVERRIDING {
    public static void main(String[] args) {
        parent1 p1=new child1();

        p1.msg();
    }

}
