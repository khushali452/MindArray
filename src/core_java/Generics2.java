package core_java;


//we can create a generic method that can accept any type of arguments. Here, the scope of arguments is limited to the method where it is declared.
//It allows static as well as non-static methods.
public class Generics2 {

    public static <E> void printArr(E[] elements){
        for(E element : elements){
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {10,20,30,40,50};
        Character[] chararr = {'J','A','V','A'};

        printArr(intArr);
        printArr(chararr);
    }
}
