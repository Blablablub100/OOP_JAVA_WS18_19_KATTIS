package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: TimeLoop.java
 * Link: https://open.kattis.com/contests/eu6hf6/problems/timeloop
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.08
 */

public class TimeLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean run;
        int n;

        do {
            run = false;
            n = sc.nextInt();
            if(n < 1 || n > 100) run = true;
        } while(run);   // loops until the entered value is in the value range

        sc.close();

        // puts n times counter and Abracadabra out
        for (int cnt = 1; cnt <= n; cnt++) {
            System.out.println(cnt + " Abracadabra");
        }
    }
}
