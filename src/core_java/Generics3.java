package core_java;
import java.util.*;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("rectangle");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("circle");
    }
}

public class Generics3 {

    //the below statement means object of only child class of shape class can be made
    public static void drawShapes(List<? extends Shape>lists){
        for(Shape s:lists){
            //calling method of Shape class by child class instance
            s.draw();
        }
    }

    public static void main(String[] args) {
        List <Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2= new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);

    }
}
