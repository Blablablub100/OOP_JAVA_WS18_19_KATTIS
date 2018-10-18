package W1.T2;

import java.util.Random;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Quadratic.java
 * Link: http://introcs.cs.princeton.edu/java/12types/Quadratic.java.html
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class RandomSeq {
    public static void main(String[] args) {

        // command-line argument
        int n = Integer.parseInt(args[0]);

        // generate and print n numbers between 0 and 1
        for (int i = 0; i < n; i++) {
            System.out.println(Math.random());

        }
    }
}
