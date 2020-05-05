package P_CodingBat;

public class W1_monkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        } else {
            return false;
        }
    }

}
