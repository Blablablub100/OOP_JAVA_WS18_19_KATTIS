package W4.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Check the relation between UpperCase, LowerCase Letters ans symbols for spam detection
 * Link: https://open.kattis.com/contests/ww2rp4/problems/alphabetspam
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/15/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.14
 */

public class AlphabetSpam {

    public static void main(String[] args) {
        String input = getInput();
        int white = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int symbols = 0;

        for (int i = 0; i < input.length(); i++) {
            int c = input.charAt(i);
                // 95 is "_"
            if (c == 95) {
                white++;
                // lowerCase
            } else if (c >= 97 && c <= 122) {
                lowerCase++;
                // upperCase
            } else if (c >= 65 && c <= 90) {
                upperCase++;
                // rest is symbols
            } else {
                symbols++;
            }
        }

        System.out.println(((double)white) / ((double)input.length()));
        System.out.println(((double)lowerCase) / ((double)input.length()));
        System.out.println(((double)upperCase) / ((double)input.length()));
        System.out.println(((double)symbols) / ((double)input.length()));
    }

    // user input
    private static String getInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        return input;
    }
}
