package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Marko.java checks if String is possible with certain keys of a T9 keyboard.
 * Link: https://open.kattis.com/contests/eu6hf6/problems/yoda
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.22s
 */


public class Marko {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount = Integer.valueOf(sc.nextLine());
        String[] input = new String[amount];
        String numbers;

        for (int i = 0; i < amount; i++) {
            input[i] = sc.nextLine();
        }
        numbers = sc.nextLine();
        sc.close();
        String[] letters = generatePossibleLetters(numbers);

        int cnt = 0;

        // iterates through every String and then...
        for (int i = 0; i < amount; i++) {
            for (int c = 0; c < input[i].length(); c++) {
                // ... checks if every letter is in the previously generated String.
                if (letters[c].contains(String.valueOf(input[i].charAt(c)))) {
                    if (c == input[i].length()-1) {
                        cnt++;
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println(cnt);
    }

    // creates a String array to know which Strings are possible at which place in the String
    private static String[] generatePossibleLetters(String numbers) {
        String[] res = new String[numbers.length()];
        for (int i = 0; i < res.length; i++) {
            res[i] = generatePossibleLetters(numbers.charAt(i));
        }
        return res;
    }

    // creates a String with all possible letters
    private static String generatePossibleLetters(char number) {
        String numbers = String.valueOf(number);
        StringBuilder res = new StringBuilder();
        if (numbers.contains("2")) {
            res.append("abc");
        }
        if (numbers.contains("3")) {
            res.append("def");
        }
        if (numbers.contains("4")) {
            res.append("ghi");
        }
        if (numbers.contains("5")) {
            res.append("jkl");
        }
        if (numbers.contains("6")) {
            res.append("mno");
        }
        if (numbers.contains("7")) {
            res.append("pqrs");
        }
        if (numbers.contains("8")) {
            res.append("tuv");
        }
        if (numbers.contains("9")) {
            res.append("wxyz");
        }
        return res.toString();
    }
}
