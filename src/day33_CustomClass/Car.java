package day33_CustomClass;

public class Car {

    String brand; // instance variable
    String model;
    int year;
    String color;


    public void start() {
        System.out.println(brand + " is started");
    }

    public void drive() {
        System.out.println("Driving " + brand + " " + model);
    }

    public void getCarInfo() {
        System.out.println(year + " " + brand + " " + model + " " + color);
    }

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor) {
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
    }


    public String toString() {
        String result = brand + " " + year + " " + model + " " + color;
        return result;
    }


    public static void main(String[] args) {
        int a = 100;  // local variable
    }
}
