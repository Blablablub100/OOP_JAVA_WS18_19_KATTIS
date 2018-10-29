package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Helps a teacher to determine weather her exercises are possible
 * Link: https://open.kattis.com/contests/pp5rtp/problems/numberfun
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/29/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.33
 */

public class NumberFun {

    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] values = new int[n][3];
        for (int i = 0; i < n ; i++) {
            String[] input = sc.nextLine().split(" ");
            values[i][0] = Integer.parseInt(input[0]);
            values[i][1] = Integer.parseInt(input[1]);
            values[i][2] = Integer.parseInt(input[2]);
        }
        sc.close();

        // checks if each number combination is possible and prints the result
        for (int i = 0; i < n; i++) {
            if (isPossilbe(values[i])) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }

    private static boolean isPossilbe(int[] n) {
        // calculates all possible results to compare it to given result
        int addition = n[0] + n[1];
        int multiplication = n[0] * n[1];
        int subtraction1 = n[0] - n[1];
        int subtraction2 = n[1] - n[0];
        int division1 = n[0] / n[1];
        // at division it must be checked if a division is even possible
        boolean div1poss = ((n[0] % n[1]) == 0);
        int division2 = n[1] / n[0];
        boolean div2poss = ((n[1] % n[0]) == 0);

        if (addition == n[2]
                || multiplication == n[2]
                || subtraction1 == n[2]
                || subtraction2 == n[2]
                || (division1 == n[2] && div1poss)
                || (division2 == n[2] && div2poss)) {
            return true;
        }
        return false;
    }
}
