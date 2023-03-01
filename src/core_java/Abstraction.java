package core_java;

abstract class Bank{
    abstract int getRateOfInterest();
}

//here SBI inherits abstract class method getROI
//to inherit either the inherited class should be abstract or it should inherit abstract class method
class SBI extends bank {
    int getRateOfInterest(){
        return 7;
    }
}

class PNB extends bank {
    int getRateOfInterest(){
        return 8;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        bank b;
        b = new sbi();
        System.out.println(b.hashCode());
        System.out.println("Rate of intrest is :" +b.getRateOfInterest()+"%");
        b = new PNB();
        System.out.println(" Rate Of Interest is : "+b.getRateOfInterest() + "%");
        System.out.println(b instanceof bank);

    }

}
