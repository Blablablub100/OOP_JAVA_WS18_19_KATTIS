package W1.T6;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: TimeLoop.java
 * Link: https://open.kattis.com/contests/eu6hf6/problems/timeloop
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class TimeLoop {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        // puts n times counter and Abracadabra out
        if (n <= 100) {
            for (int cnt = 1; cnt <= n; cnt++) {
                System.out.println(cnt + " Abracadabra");
            }
        }
    }
}
