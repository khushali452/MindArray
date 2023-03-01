package core_java;

//abstract class with abstract and non abstract methods
abstract class Bike{
    Bike(){
        System.out.println("bike is created");
    }

    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Honda running safe ");
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
