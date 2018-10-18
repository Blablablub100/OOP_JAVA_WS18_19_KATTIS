package W1.T3;

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
        int n = Integer.parseInt(args[0]);

        // generate and print n numbers between 0 and 1
        for (int i = 0; i < n; i++) {
            System.out.println(Math.random());

        }
    }
}
