package W3.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: ARealChallenge.java calculating the lenght in m of a fence for a specific area in m²
 * Link: https://open.kattis.com/contests/ww2rp4/problems/areal
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/08/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.08
 */

public class ARealChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        sc.close();

        // calculates the fence length and outputs it
        System.out.print((Math.sqrt(a))*4);
    }
}
