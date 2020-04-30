package day16_ForLoop;

public class Alphabets {
    public static void main(String[] args) {

        String upperCase = ""; // A-Z
        String lowerCase = ""; // a-z

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            upperCase += ch;
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            lowerCase += ch;
        }
        System.out.println(lowerCase);
        System.out.println(upperCase);

        // Aa Bb Cc Dd .....
        String result = "";

        for (int i = 0; i <= upperCase.length() - 1; i++) {
            result += upperCase.charAt(i) + "" + lowerCase.charAt(i) + " "; // we put "" to get an String output
        }
        System.out.println(result);

        // second solution

        int a = 97;
        int A = 65;
        String result2 = "";

        for (int i = 0; i < 26; i++){
            char ch = (char) (A + i); // uppercase
            //               65 + 0
            char ch2 = (char) (a + i); // lowercase
            //                97 + 0
            result2 += ch + "" + ch2 + " ";
        }
        System.out.println(result2);

    }
}
