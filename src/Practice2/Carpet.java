package Practice2;

public class Carpet {
    int width;
    int length;
    int unitPrice;
    boolean isPersian;

    public void customOrder(int cWidth, int cLength, int cUnitPrice, boolean cIsPersian) {
        width = cWidth;
        length = cLength;
        unitPrice = cUnitPrice;
        isPersian = cIsPersian;
    }

    public double calcCost() {
        int cost = 0;
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
