package core_java;

public class Throw_Exception {

    public static void validate(int age){
        if(age <18){
            throw new ArithmeticException("Not eligible to vote");

        }
        else{
            System.out.println("eligible to vote");
        }
    }
    public static void main(String[] args) {
        //calling the function
        validate(13);
        System.out.println("rest of the code...");
    }
}
