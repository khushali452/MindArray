package core_java;


class Singltn{
    private static Singltn single_instance=null;

    public String s;

    private Singltn(){
        s= "hey there, I am singleton class";
    }

    public static Singltn getInstance(){
        if(single_instance==null)
            single_instance=new Singltn();
        return single_instance;
    }
}
public class Singleton {
    public static void main(String[] args) {
        Singltn x = Singltn.getInstance();
        Singltn y = Singltn.getInstance();
        Singltn z = Singltn.getInstance();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

        if(x==y && y==z){
            System.out.println("Three objects point to same memory location on the heap i.e , to the same object");
        }else{
            System.out.println("Three objects do not point to the same memory location on the heap");
        }
    }
}
