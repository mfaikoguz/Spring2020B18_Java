package P_CodingBat;

public class W1_front3 {
    public static String front3(String str) {
        if (str.length() < 3) {
            return str + "" + str + "" + str;
        }
        String front = str.substring(0, 3);
        return front + "" + front + "" + front;
    }

    public static void main(String[] args) {
        String a = front3("Java");
        System.out.println(a);
    }

}
