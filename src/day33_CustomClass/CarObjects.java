package day33_CustomClass;

public class CarObjects {


    public static void main(String[] args) {

        Car car1 = new Car(); // first object

        car1.brand = "BMW";
        car1.model = "320i";
        car1.year = 2020;
        car1.color = "Red";

        System.out.println(car1.brand); // instance variables are object variables, we can call them through the object name
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        car1.start();
        car1.drive();
        car1.getCarInfo();

        System.out.println("=======================================================");

        Car car2 = new Car(); // second object

        car2.brand = "Mercedes";
        car2.model = "GLA-250";
        car2.year = 2020;
        car2.color = "Black";

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        car2.start();
        car2.drive();
        car2.getCarInfo();

        System.out.println("============================================");


        Car car3 = new Car();
        car3.brand = "Mercedes";
        car3.model = "C Class";
        car3.year = 2020;
        car3.color = "Black";

        car3.getCarInfo();
        car3.start();
        car3.drive();

        System.out.println("==========================");
        String str = "A";
        String str2 = "B";

        String[] arr = {str, str2};


        Car[] cars = {car1, car2, car3};

        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();



        /*
            create 5 car objects
            put them in an array of cars
            use for loop to get each car info
            use for each loop to get each car
            info
         */


    }

}