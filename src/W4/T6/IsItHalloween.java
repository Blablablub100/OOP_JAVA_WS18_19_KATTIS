package W4.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Checks if today is Halloween
 * Link: https://open.kattis.com/contests/ww2rp4/problems/isithalloween
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/08/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.07
 */

public class IsItHalloween {

    public static void main(String[] args) {
        String input = getInput();

        if (input.equals("OCT 31") || input.equals("DEC 25")) {
            // OCT 31 -> yup ...
            System.out.println("yup");
        } else {
            // ... everything else -> nope
            System.out.println("nope");
        }
    }

    // gets user input
    private static String getInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        return input;
    }
}
