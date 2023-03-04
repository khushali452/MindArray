package core_java;

class Animal{
    public void makeNoise(){
        System.out.println("yay");
    };
}
//class with no name that we use to instantiate *one* object
public class Anonymous {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        //creating an anonymous subclass of animal class and writing its class definition after constructor call in curly braces
        Animal bigfoot = new Animal(){
            @Override
            public void makeNoise() {
                System.out.println("haha");
            }

        };
        bigfoot.makeNoise();

    }
}

