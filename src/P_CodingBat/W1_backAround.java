package P_CodingBat;

public class W1_backAround {
    public static String backAround(String str) {
        char lastLetter = str.charAt(str.length() - 1);
        return "" + lastLetter + str + lastLetter;
    }

    public static void main(String[] args) {
        String a = backAround("cat");
        System.out.println(a);
    }
}
