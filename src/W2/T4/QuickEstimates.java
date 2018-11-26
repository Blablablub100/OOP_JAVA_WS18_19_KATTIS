package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Find out how many digits an int contains
 * Link: https://open.kattis.com/contests/pp5rtp/problems/quickestimate
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/01/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.08
 */

public class QuickEstimates {

    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            // the amount of digits the number contains of is
            // equal the length of the String
            vals[i] = sc.nextLine().length();
        }

        // output of each result
        for (int i = 0; i < n; i++) {
            System.out.println(vals[i]);
        }
    }
}
