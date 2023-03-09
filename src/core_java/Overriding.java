package core_java;

class bank {
    int getRateOfInterest(){return 0;}
}
//Creating child classes.
class sbi extends bank1 {
    int getRateOfInterest(){return 8;}
}

class ICICI extends bank1 {
    int getRateOfInterest(){return 7;}
}
class AXIS extends bank1 {
    int getRateOfInterest(){return 9;}
}
//Test class to create objects and call the methods
class Overriding{
    public static void main(String args[]){
        sbi s=new sbi();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
