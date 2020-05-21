package day43_MethodOverriding;

public class Shape {
    /*
    1. create a class called ShapeActions:
                methods: calculateArea(), calculatePerimeter()
     */

    public double area;
    public double perimeter;


    public void calculateArea() {
        area = 0;
        System.out.println("Area of the shape: " + area);
    }

    public void calculatePerimeter() {
        perimeter = 0;
        System.out.println("Perimeter of the shape: " + perimeter);
    }
}