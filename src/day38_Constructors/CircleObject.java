package day38_Constructors;

public class CircleObject {
    public static void main(String[] args) {
        double r = 3;

        Circle circle1 = new Circle(r);

        double areaOfCircle = circle1.area();

        System.out.println(areaOfCircle);

        System.out.println(circle1);

    }
}
