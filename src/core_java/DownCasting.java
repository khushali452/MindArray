package core_java;

class Animal1{}

class Dog extends Animal1
{
    static void method(Animal1 a)
    {
        //downcasting by instanceof method where object is of parent class
        if(a instanceof Dog)
        {
            Dog d = (Dog)a;

            System.out.println("downcasting done");
        }
    }
}

public class DownCasting
{
    public static void main(String[] args)
    {

        //Dog d = new Animal(); --> gives compilation error
        //Dog d = (Dog)new Animal();--> gives runtime classcasting exception
        Animal1 a = new Dog();

        Dog.method(a);
    }
    
}
