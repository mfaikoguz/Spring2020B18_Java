package P_CodingBat;

public class W1_frontBack {
    public static String frontBack(String str) { // apple --> eppla
        if (str.length() <= 1) {
            return str;
        }
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() - 1);
        return "" + lastLetter + str.substring(1, str.length() - 1) + firstLetter;
    }

    public static void main(String[] args) {
        String a = frontBack("apple");
        System.out.println(a);
    }

}
