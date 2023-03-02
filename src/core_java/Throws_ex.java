package core_java;

import java.io.*;
class M{

    //here throws simply indicates jvm that ioexception could occur
    void method()throws IOException{
        //here a custom exception is thrown
        throw new IOException("device error");
    }
}
public class Throws_ex {
    public static void main(String args[])throws IOException{//declare exception
        M m=new M();
        //while calling the method exception is encountered and as here it is not handled the program terminates
        m.method();

        //if we handle the method by try catch block the flow of program is maintained
        /*try {
            m.method();
        }catch(IOException e){
            System.out.println("handled exception");
        }*/

        System.out.println("normal flow...");
    }
}
