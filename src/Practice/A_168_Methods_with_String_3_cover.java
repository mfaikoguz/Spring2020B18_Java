package Practice;

public class A_168_Methods_with_String_3_cover {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me")); //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        String result = "";
        if (main.contains(coverME)) {
            result = main.replaceAll(coverME, "[" + coverME + "]");
        } else {
            result = "[" + main + "]";
        }
        return result;
    }
}
