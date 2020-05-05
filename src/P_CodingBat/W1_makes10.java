package P_CodingBat;

public class W1_makes10 {
    public boolean makes10(int a, int b) {
        if ((a == 10 || b == 10) || (a + b == 10)) {
            return true;
        } else {
            return false;
        }
    }

}
