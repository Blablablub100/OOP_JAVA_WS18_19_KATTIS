package W4.T2;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Exercise 4 Task 2
 * Link: https://docs.oracle.com/javase/tutorial/collections/intro/index.html
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/15/2018
 *
 * Method : Ad-Hoc
 * Status : ???
 * Runtime: ???
 */

import java.util.*;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        int time = Integer.parseInt(args[0]);
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = time; i >= 0; i--)
            queue.add(i);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
            Thread.sleep(1000);
        }
    }
}