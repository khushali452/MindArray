package core_java;

//static final class is created in backend named mobile

//enum extends Enum abstract class.it implements comparable and serializable class
//hence enum cannot extend any other class but can implement interfaces
enum Mobile{
    APPLE(100), SAMSUNG,HTC(90);
    int price;
    Mobile(){
        price=80;
        System.out.println("Constructor");
    }
    Mobile(int p){
        price=p;
    }
    public int getPrice(){
        return price;
    }
}



public class Enum {
    public static void main(String[] args) {
        System.out.println(Mobile.APPLE.ordinal());
    }
}
