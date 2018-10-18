package W1.T3;

import java.util.Random;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: RandomSeqAB.java
 * Link: https://introcs.cs.princeton.edu/java/15inout/RandomSeq.java.html
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class RandomSeqAB {
    public static void main(String[] args) {

        // command-line argument
        int n = Integer.parseInt(args[2]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        Random r = new Random();

        // generate and print n numbers between a and b
        for (int i = 0; i < n; i++) {
            int res = r.nextInt(b - a);
            res = res + a;
            System.out.println(res);
        }
    }
}
