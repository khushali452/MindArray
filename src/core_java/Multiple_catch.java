package core_java;

public class Multiple_catch {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            System.out.println(a[10]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception occurs");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bunds exception");
        }catch(Exception e){
            System.out.println("parent exception occurs");
        }
        System.out.println("rest of code");
    }
}
