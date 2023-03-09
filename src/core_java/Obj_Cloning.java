package core_java;

class Students implements Cloneable{
    int roll;
    String name;

    Students(int roll,String name){
        this.roll=roll;
        this.name=name;

    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Obj_Cloning {
    public static void main(String[] args) {
        try{
            Students student = new Students(101,"khushali");
            Students student2 = (Students)student.clone();

            //As you can see in the above example, both reference variables have the same value.
            // Thus, the clone() copies the values of an object to another object.
            // So we don't need to write explicit code to copy the value of an object to another.
            System.out.println(student.roll+"original "+student.name);
            System.out.println(student2.roll+" "+student2.name);


            //it gives false . Hence, two different objects are created
            System.out.println(student==student2);

            //any change to any of these objexts will not have impact on the other
             student2.roll=120;
            System.out.println(student.roll+"original "+student.name);
            System.out.println(student2.roll+" "+student2.name);

        }catch(CloneNotSupportedException c){

        }
    }
}
