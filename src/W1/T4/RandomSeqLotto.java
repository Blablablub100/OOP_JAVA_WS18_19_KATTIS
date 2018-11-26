package W1.T4;

import java.util.Random;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: RandomSeqLotto.java
 * Link: https://introcs.cs.princeton.edu/java/15inout/RandomSeq.java.html
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : Ad-Hoc
 * Status : ???
 * Runtime: ???
 */

public class RandomSeqLotto {
    public static void main(String[] args) {

        int a = 1;
        int b = 49;
        int n = 6;

        Random r = new Random();

        // makes random lotto numbers
        for (int i = 1; i <= n; i++) {
            int res = r.nextInt(b - a);
            res = res + a;
            System.out.println(res);
        }

    }
}
