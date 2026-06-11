import java.util.*;
public class WordLengthTable {
    public static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        String[] words = new String[count];

        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        words[index] = word;

        return words;
    }

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] getWordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] table = getWordLength(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < table.length; i++) {
            System.out.println(
                    table[i][0] + "\t" +
                    Integer.parseInt(table[i][1]));
        }
        sc.close();
    }
}
