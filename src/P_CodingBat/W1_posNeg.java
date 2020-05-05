package P_CodingBat;

public class W1_posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if ((a > 0 && b < 0) || (a < 0 && b > 0)){
            return true;
        } else if (negative && (a < 0 && b < 0)) {
            return true;
        } else {
            return false;
        }
    }

}
