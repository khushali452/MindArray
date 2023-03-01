package core_java;

public class TryCatch {
    public static void main(String[] args) {

        String s= null;
        //prints null but is s.length is printed , it givel null pointer exception
        System.out.println(s);

        try
        {
            int arr[]= {1,3,5,7};
            System.out.println(arr[10]); //may throw exception
        }
        // handling the array exception
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
