package core_java;
import java.io.FileInputStream;
public class InputStream {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("/home/khushali/datapoints.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }

}
