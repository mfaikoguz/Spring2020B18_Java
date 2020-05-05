package P_CodingBat;

public class W1_parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((talking && hour < 7) || (talking && hour >= 21)){
            return true;
        } else {
            return false;
        }
    }

}
