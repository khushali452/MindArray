package core_java;

// Parent class
class Base {

    // Non-static method which will be overridden in derived class
    public int add(int a, int b) {
        System.out.println("In the base class.");
        return a + b;
    }

    // static method which will not be overridden
    //in the derived class
    public static void print() {
        System.out.println("In the Base class.");
    }
}

// Child class
class Derived extends Base {

    // This method overrides add() of Base class
    // because it not a static method
    public int add(int a, int b) {
        System.out.println("In the child class.");
        return a + b;
    }

    // This method is hidden by print() in Base
    public static void print() {
        System.out.println("In the child class.");
    }
}

// Driver class
public class Overhiding{

    public static void main(String args[]) {
        Base obj = new Derived();

        // Here Derive's add() is called
        //according to overriding rules
        System.out.println(obj.add(4, 5));

        //This should invoke the print method of class Derive,
        //as per overriding rules.
        //Because a static method can't be overridden,
        //it uses Base's print instead
        obj.print();
    }
}