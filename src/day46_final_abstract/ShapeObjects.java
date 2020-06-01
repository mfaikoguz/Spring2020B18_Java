package day46_final_abstract;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle obj1 = new Circle(10);
        obj1.Area();

        Square obj2 = new Square(10);
        obj2.Area();

        Rectangle obj3 = new Rectangle(10,10);
        obj3.Area();
    }
}