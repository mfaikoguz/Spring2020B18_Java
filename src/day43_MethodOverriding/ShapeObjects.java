package day43_MethodOverriding;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5.5);

        System.out.println(circle1.radius);

        circle1.calculateArea(); // bug, suppose to be: Pi * r * r --> solved
        circle1.calculatePerimeter(); // bug --> solved

        System.out.println("=================================");

        Rectangle rectangle1 = new Rectangle(3, 2);

        System.out.println(rectangle1.length);
        System.out.println(rectangle1.width);

        rectangle1.calculateArea(); // bug suppose to be: w * l --> solved
        rectangle1.calculatePerimeter(); // bug --> solved

        System.out.println("=================================");

        Square square1 = new Square(3);

        System.out.println(square1.side);

        square1.calculateArea(); // bug suppose to be: side * side --> solved
        square1.calculatePerimeter(); // bug --> solved

    }
}
