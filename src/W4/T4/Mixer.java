package W4.T4;

import java.util.Random;

public class Mixer {
    public static void main(String[] args) {
        FileIO rw = new FileIO();

        String input = rw.readFile("src/W4/T4/text.in");
        System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            // if there is a letter, this means there is a word...
            if (isLetter(input.charAt(i))) {

                int l = i+1;
                char tmp = input.charAt(i);
                while(isLetter(tmp)) {
                    i++;
                    tmp = input.charAt(i);
                }
                int r = i-1;

                // ... so mix it up
                input = mix(input, l, r);
            }
        }
        System.out.println(input);
        rw.writeFile("src/W4/T4/text.out", input);
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

    // scrambles the letters in a string from l to r
    private static String mix(String inp, int l, int r) {
        StringBuilder input = new StringBuilder(inp);
        Random rand = new Random();
        int length = r-l;

        // changes every char randomly to a random space
        for (int i = 0; i < length; i++) {
            int curr_index = l + i;
            int new_index = l + rand.nextInt(length);
            char tmp = input.charAt(new_index);
            input.setCharAt(new_index, input.charAt(curr_index));
            input.setCharAt(curr_index, tmp);
        }
        return input.toString();
    }
}
