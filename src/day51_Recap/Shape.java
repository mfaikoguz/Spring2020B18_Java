package day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Shape {
    /*
      1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double

     */

    public static String name;

    public abstract double calculateArea();

    public abstract double calculatePerimeter1();
}

interface Volume {
    /*
    2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
     */

    boolean hasVolume = true;

    double calculateVolume();
}

interface PI {
    /*
      3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)
     */

    double PI = 3.14;
}

final class Circle extends Shape implements PI {
    /*
     4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius

     */

    double radius;

    static {
        name = "Circle";
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter1() {
        return 2 * PI * radius;
    }
}

final class Cylinder extends Shape implements Volume, PI {
    /*
     5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height

     */
    double radius;
    double height;

    static {
        name = "Circle";
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (PI * 2 * radius * radius) + (height * PI * 2 * radius);
    }

    @Override
    public double calculatePerimeter1() {
        return PI * 2 * radius + height;
    }

    @Override
    public double calculateVolume() {
        return PI * radius * radius * height;
    }

}

class ShapeObjects {
    /*
     6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
     */

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        Cylinder cylinder1 = new Cylinder(3, 5);
        Cylinder cylinder2 = new Cylinder(3, 5);

        ArrayList<Shape> list = new ArrayList<>();
        list.addAll(Arrays.asList(circle1, circle2, cylinder1, cylinder2));

        for (Shape eachShape : list) {
            System.out.println(eachShape.name + " : " + eachShape.calculateArea());
        }

        System.out.println("======================");
        //list.get(2).calculateVolume();  // reference type is Shape, shape does not have the method
        double d = ((Cylinder) list.get(3)).calculateVolume();
        System.out.println(d);

        // ((Cylinder)list.get(1)).calculateVolume();  //is A relation is precondition of Reference castings
        // circle cannot be referenced by cylinder

        Shape s1 = new Circle(6);
        //  System.out.println( s1.radius );
        System.out.println(((Circle) s1).radius);


/*
       // Shape shape1 = circle1; // upcasting
        Shape shape2 = new Cylinder(3,6);
       // shape2.calculateVolume();
        (  (Cylinder)shape2 ).calculateVolume();  // down casting
 */

    }
}