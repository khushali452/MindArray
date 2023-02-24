package core_java;

public class Access_modifiers {

    //As this method is public it can be accessed by all the packages
    //if default , then it is accessible within a package only
    //if this method is converted to protected , only files from same package can access it i.e same_pkg file.We can acess it outside the package but through inheritance only.
    //if it is made private , it cannot be accessed to any other files.It is only accessible within the class

    public void fun(){
        System.out.println("hey there . I am function in corejava pkg!");
    }

    public static void main(String[] args) {
        System.out.println("this is new");
        double a = 8.2/2;
        System.out.println(a);
    }
}
