package core_java;

class Outerclass{
    int num=6;

    public void hey(){
        System.out.println("hey!");
    }

    public class InClass{
        int innum=8;

        public void hello(){
            System.out.println("hello from inner class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Outerclass outer = new Outerclass();
        outer.hey();
        //as inner class is not static we need to get instance of outer class here
        Outerclass.InClass inner = outer.new InClass();
        inner.hello();
    }
}
