package core_java;

class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id =id;
        this.name=name;
    }
}

class Employee extends Person{
    float salary;
    Employee(int id, String name,float salary){
        //parent class constructor is reused by super
        super(id,name);
        this.salary =salary;
    }
    void display(){
        System.out.println(id +" "+name+" "+salary);
    }
}
public class Super {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"khushali",15000f);
        e1.display();
    }
}
