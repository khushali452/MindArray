package core_java;

class add{

    int a1 = 10;
    void addTwoNumber(int a,int b)
    {
        System.out.println(a + b);

    }

}

class b extends add{

    void aa()
    {
        System.out.println(a1);
    }

}

public class Static_Block {

    static {
        System.out.println("before main");
    }
    public static void main(String[] args) {

        System.out.println("main");

        String s = new String("pruthvi");
        s =  s.concat("khushali");
        System.out.println(s);

    }
}
