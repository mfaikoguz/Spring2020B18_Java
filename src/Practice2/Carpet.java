package Practice2;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersian;

    public Carpet() {
        this.width = 300;
        this.length = 300;
        this.totalPrice = 200;
        this.isPersian = false;
        this.unitPrice = 0;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        this.totalPrice = (width + length) * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
    }
}

class Main {
    public static void main(String[] args) {

        Carpet c = new Carpet();
        System.out.println(c.totalPrice);


        Carpet c2 = new Carpet(20,20,2,false);
        System.out.println(c2.totalPrice);

    }
}