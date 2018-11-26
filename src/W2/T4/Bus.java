package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Calculate how many passengers were in the bus
 * Link: https://open.kattis.com/contests/pp5rtp/problems/bus
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/29/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class Bus {

    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] tests = new int[n];
        for (int i = 0; i < tests.length; i++) {
            tests[i] = Integer.parseInt(sc.nextLine());
        }
        sc.close();

        // outputting every result
        for (int i = 0; i < tests.length; i++) {
            System.out.println(getPassengers(tests[i]));
        }
    }

    // calculates how many passengers where in bus at the beginning
    public static long getPassengers(int stops) {
        double passengers = 0.0;
        for (int i = 0; i < stops; i++) {
            passengers = (passengers+0.5) * 2;
        }
        // the numbers are so big that long must be used
        return (Math.round(passengers));
    }
}
