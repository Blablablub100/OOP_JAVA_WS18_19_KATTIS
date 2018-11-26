package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: JumbledCompass.java calculates the shortest distance between two points in a compass
 * Link: https://open.kattis.com/contests/eu6hf6/problems/compass
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class JumbledCompass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int curr = Integer.valueOf(sc.nextLine());
        int corr = Integer.valueOf(sc.nextLine());
        sc.close();
        if (curr > 359 || curr < 0 || corr > 359 || corr < 0) System.exit(0);

        // left stands for the way the needle hast to travel when spinning to the left
        int left = 0;
        int right = 0;

        // calculates the length of both ways...
        if (corr > curr) {
            left = (curr + (360-corr)) * (-1);
            right = corr - curr;
        } else if (curr > corr) {
            left = (curr-corr) * (-1);
            right = (corr + (360-curr));
        }

        // ... and then compares the length of them to show the shortest way
        if (left == -180 || right == -180) {
            System.out.println(180);
        }else if (Math.abs(left) > Math.abs(right)) {
            System.out.println(right);
        } else {
            System.out.println(left);
        }
    }
}
