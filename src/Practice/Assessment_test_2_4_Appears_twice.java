package Practice;

public class Assessment_test_2_4_Appears_twice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean a = appearsTwice("java", "i like java and java only");
        System.out.println(a);
    }

    /**
     * @param target   - string that you need to check.
     * @param sentence - string where you need to lookup for target.
     * @return
     */
    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;
        boolean a = true;
        while (a) {
            if (sentence.contains(target)) {
                sentence = sentence.replaceFirst(target, "");
                count++;
            } else {
                a = false;
            }
        }
        return count == 2;
    }

}