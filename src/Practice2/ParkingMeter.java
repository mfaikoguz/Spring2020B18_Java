package Practice2;

public class ParkingMeter {
    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int num) {
        if (num == 25) {
            timeLeft += 30;
            return true;
        } else {
            return false;
        }

    }

    public void tick() {
        if (timeLeft > 0) {
            timeLeft -= 1;
        }
    }

    public boolean isExpired() {
        if (timeLeft == 0) {
            return true;
        } else {
            return false;
        }
    }
}

class Main5{
    public static void main(String[] args) {
        ParkingMeter obj1 = new ParkingMeter(6);
    }
}