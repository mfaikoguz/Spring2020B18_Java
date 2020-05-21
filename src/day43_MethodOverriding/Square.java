package day43_MethodOverriding;

public class Square extends Shape {

    public double side;

    public Square(double side) {
        this.side = side;
    }

    public void calculateArea() {
        area = side * side;
        System.out.println("Area of the shape: " + area);
    }

    public void calculatePerimeter() {
        perimeter = 2 * (side + side);
        System.out.println("Perimeter of the shape: " + perimeter);
    }

}
