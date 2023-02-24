package core_java;

class Student{
    int id;
    String name;

    void insertRecord(){
        int roll= 10;
    }
}
public class Method {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=10;
        s1.name="lol";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
