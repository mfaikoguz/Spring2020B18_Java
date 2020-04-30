package day21_MultiDimensionalArrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {
        /*
        2. write a program that can return the longest string of text from an array
	    3. write a program that can return the shortest string of text from an array
        */

        String[] names = {"Oguz", "Faik", "Mehmet", "Faker", "Memet"};

        int MaxLengthString = names[0].length();

        for (int i = 1; i < names.length; i++) {
        String longestWord = "";
            if (names[i].length() > MaxLengthString) {
                MaxLengthString = names[i].length();
                longestWord = names[i];
                System.out.println(longestWord);
            }
        }
    }
}
