package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Find out if building a railroad with a certain amount of pieces is possible.
 * Link: https://open.kattis.com/contests/pp5rtp/problems/railroad2
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/29/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.07
 */

public class Railroad {

    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        // check how many openings the track has. A Y has 3 openings, an X 4.
        int openings = (4*x) + (3*y);
        // if the amount of openings is uneven it is impossible
        // to have every openings connected to another
        if (openings%2 == 0) {
            System.out.println("possible");
        } else {
            System.out.println("impossible");
        }
    }
}
