package core_java;

//Created a generic type for class printer
 class Printer<T>{
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint =thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
public class Generics {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(33.5);
        doublePrinter.print();
    }
}
