package Practice2;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double cWidth, double cLength, double cUnitPrice, boolean cIsPersian) {
        width = cWidth;
        length = cLength;
        unitPrice = cUnitPrice;
        isPersian = cIsPersian;
    }

    public double calcCost() {
        double cost = 0;
        if (isPersian) {
            cost = ((width + length) * unitPrice) + 200;
        } else {
            cost = ((width + length) * unitPrice);
        }
        return cost;
    }

    public String toString() {
        String result = "Width: " + width + ", Length: " + length + ", Unit Price: " + unitPrice + ", Cost: $" + calcCost();
        return result;
    }
}
