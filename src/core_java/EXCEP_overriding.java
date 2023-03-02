package core_java;
import java.io.*;

class parent{
    void msg(){
        System.out.println("Parent Method");
    }
}

class child extends parent{


    //this gives compile time error.
    // If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.

    //vois msg() throws IOException{} gives error as it is checked excetption while arithetic exception
    // is unchecked and hence can be thrown in child method

    void msg() throws ArithmeticException{
        System.out.println("child class");

    }
}
public class EXCEP_overriding {
    public static void main(String[] args) {
        parent p1 = new child();
        p1.msg();
    }

}
