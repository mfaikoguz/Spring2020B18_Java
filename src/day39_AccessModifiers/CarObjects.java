package day39_AccessModifiers;

public class CarObjects {

    public static void main(String[] args) {
        // new Constructor
        Car car1 = new Car("Ferrari");
        System.out.println(car1);

        Car car2 = new Car("Ferrari","FXX-K");
        System.out.println(car2);

        Car car3 = new Car("Ferrari","FXX-K", 2020);
        System.out.println(car3);

        Car car4 = new Car("Ferrari","FXX-K", 2020, 500000);
        System.out.println(car4);
    }
}
