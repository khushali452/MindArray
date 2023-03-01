package core_java;

//HEre we can return the method according to its sub class's return type.Here the return type is generalised
class A1
{
    A1 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("Inside the class A1");
    }
}


// A2 is the child class of A1
class A2 extends A1
{
    @Override
    A2 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("Inside the class A2");
    }
}

// A3 is the child class of A2
class A3 extends A2
{
    @Override
    A3 foo()
    {
        return this;
    }

    @Override
    void print()
    {
        System.out.println("Inside the class A3");
    }
}


public class Covariant_Return {

    public static void main(String args[])
    {
        A1 a1 = new A1();

        a1.foo().print();

        A2 a2 = new A2();

        a2.foo().print();

        A3 a3 = new A3();

        a3.foo().print();

    }
}
