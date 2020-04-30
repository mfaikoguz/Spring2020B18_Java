package Practice;

public class A_161_Methods_with_return_6_water_tax {
    public static double waterTax(double units) {
        double bill = 0.0;
        if (units <= 50) {
            bill += units * 0.60;
        } else if (units > 50 && units <= 100) {
            bill += units * 0.90;
        } else if (units > 100 && units <= 150) {
            bill += units * 0.90 + 50;
        } else if (units > 150) {
            bill += units * 0.90 + 100;
        }
        return bill;
    }


}