package Practice2;

public class GasTank {
    double amount = 0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double add) {
        amount += add;
        if (amount > capacity) {
            amount = capacity;
        }
    }

    public void useGas(double use) {
        amount -= use;
        if (amount < 0) {
            amount = 0;
        }
    }

    public boolean isEmpty() {
        if (amount < 0.1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (amount > capacity - 0.1) {
            return true;
        } else {
            return false;
        }
    }

    public double getGasLevel() {
        return amount;
    }

    public double fillUp() {
        return capacity - amount;
    }

}

class Main6{
    public static void main(String[] args) {
        GasTank gasTank1 = new GasTank(2);
    }
}
