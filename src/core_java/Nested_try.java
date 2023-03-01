package core_java;


//the try block within nested try block (inner try block 2) do not handle the exception.
// The control is then transferred to its parent try block (inner try block 1).
// If it does not handle the exception, then the control is transferred to
// the main try block (outer try block) where the appropriate catch block handles the exception.
public class Nested_try {
    public static void main(String[] args) {

        try{
            try{
                System.out.println("dividing by 0");
                int b=39/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }

            try{
                int a[]=new int[5];

                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("array out of bound");
            }

            System.out.println("other statement");
        }
        catch(Exception e){
            System.out.println("handled exception with outer catch");
        }
        System.out.println("normal flow");
    }
}
