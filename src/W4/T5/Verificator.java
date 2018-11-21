package W4.T5;

import W4.T4.FileIO;

public class Verificator {

    public static void main(String[] args) {

        FileIO rw = new FileIO();
        String inp1 = rw.readFile("src/W4/T5/text1.in");
        String inp2 = rw.readFile("src/W4/T5/text2.txt");

        // if lengths arent the same, it can't be right
        if (inp1.length() != inp2.length()) no();

        for (int i = 0; i < inp1.length(); i++) {

            // if letter is found, get whole word and compare
            if (isLetter(inp1.charAt(i))
                    && isLetter(inp2.charAt(i))) {
                int start = i;      // start index of a word
                while (isLetter(inp1.charAt(i))) {
                    i++;
                }

                int end = i;        // end index of a word
                String word1 = inp1.substring(start, end);
                String word2 = inp2.substring(start, end);
                compareWords(word1, word2);
                i--;
            } else if (inp1.charAt(i) != inp2.charAt(i)) no();
        }
        System.out.println("YES");
    }

    // compares two words, if both are the same just scrambled
    private static void compareWords(String word1, String word2) {
        if (word1.length() < 1) return;
        // checks the first and last word
        if (word1.charAt(0) != word2.charAt(0)) no();
        if (word1.charAt(word1.length()-1) != word2.charAt(word2.length()-1)) no();

        // if every letter in word1 is somewhere in word 2 = same word just scrambled
        String tmp1 = word1.substring(1, word1.length()-1);
        String tmp2 = word2.substring(1, word2.length()-1);
        for (int i = 0; i < tmp1.length(); i++) {
            if (!tmp2.contains(String.valueOf(tmp1.charAt(i)))) no();
        }
    }

    private static boolean isLetter(Character c) {
        if (!(c >= 65 && c <= 90) &&
                !(c >= 97 && c <= 122) &&
                (c != 'ä') && (c != 'Ä') &&
                (c != 'ö') && (c != 'Ö') &&
                (c != 'ü') && (c != 'Ü') &&
                (c != 'ß')) {
            return false;
        }
        return true;
    }

    private static void no() {
        System.out.println("NO");
        System.exit(0);
    }
}
