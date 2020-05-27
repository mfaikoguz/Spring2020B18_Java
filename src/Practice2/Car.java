package Practice2;

public class Car {
    String make;
    String model;
    int numberOfDoors;
    double topSpeed;
    double price;

    public Car(String make, String model, int numberOfDoors, double topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, double topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(int numberOfDoors, double topSpeed, double price) {
        this.make = "unknown";
        this.model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = 90;
        this.price = 0;
    }
}

class Main7 {
    Car car1 = new Car("Honda", "Civic", 4, 100, 15000);
}

// DONE!