package Practice;

import java.util.Scanner;

public class A_097_Equals_java_python_Loop_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava = 0;
        int countPython = 0;

        while (sentence.contains("java") || sentence.contains("python")) {
            if (sentence.contains("java")) {
                sentence = sentence.replaceFirst("java", "");// her defasinda tekrardan saymamasi icin kaldirmam gerekiyor
                countJava++;
            }
            if (sentence.contains("python")) {
                sentence = sentence.replaceFirst("python", "");// her defasinda tekrardan saymamasi icin kaldirmam gerekiyor
                countPython++;
            }
        }

        System.out.println(countJava == countPython);
    }
}