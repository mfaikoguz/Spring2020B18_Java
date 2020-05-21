package day43_MethodOverriding;

public class Circle extends Shape {

    public double radius;
    public static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        area = PI * radius * radius;
        System.out.println("Area of the shape: " + area);
    }

    public void calculatePerimeter() {
        perimeter = 2 * PI * radius;
        System.out.println("Perimeter of the shape: " + perimeter);
    }

    /*
    calculateArea & calculatePerimeter
     */


}
