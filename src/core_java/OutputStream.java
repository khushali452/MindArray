package core_java;

import java.io.FileOutputStream;

public class OutputStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("/home/khushali/datapoints.txt");
            String s = "hello world";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success");

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
