package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: PaulEigon.java calculates whose turn it is to serve the ball
 * Link: https://open.kattis.com/contests/pp5rtp/problems/pauleigon
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/01/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class PaulEigon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input
        int N = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        sc.close();

        // calculation
        int res = ((P + Q) / N) % 2;

        if(res == 0) System.out.println("paul");
        else System.out.println("opponent");
    }
}