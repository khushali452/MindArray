package core_java;
interface car{
    void display();
}

class model implements car{
    public void display(){
        System.out.println("I am a car");
    }
}
public class Interface {

    public static void main(String[] args) {
        model obj =new model();
        obj.display();
    }

}
