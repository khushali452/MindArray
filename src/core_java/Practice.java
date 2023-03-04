package core_java;

class p{
    void execute() throws Exception{
        System.out.println(this.getClass());
    }
}

class c extends p{

    void execute() throws NumberFormatException {
        System.out.println(this.getClass());


    }
}

public class Practice {

    public static void main(String[] args) {
       StringBuilder s1 = new StringBuilder("l");
       StringBuilder s2 = new StringBuilder("l");
        System.out.println(s1.equals(s2));
        //here the object created references the parent class and hence call the execute method of parent class
        //As the exception thrown bu parent class is not handled by try catch or any other method , it gives compiletime error
        c po= new c();
        //this will give compile time error
        po.execute();
        //if object and reference both were of child class then it would not give compile time error because it throws runtime exception
        try{
            po.execute();
        }catch(Exception e){
            System.out.println("handle");
        }

    }
}
