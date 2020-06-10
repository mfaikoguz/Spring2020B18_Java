package P_CodingBat;

public class W1_notString {
    public static String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}
