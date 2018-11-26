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

public class FindDups2 {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String a : args)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}