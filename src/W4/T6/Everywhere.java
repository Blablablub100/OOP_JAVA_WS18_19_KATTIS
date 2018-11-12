package W4.T6;

import java.util.*;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Everywhere.java calculates in how many different cities Alice was
 * Link: https://open.kattis.com/contests/ntt8xa/problems/everywhere
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 15/08/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.12
 */

public class Everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tCases = sc.nextInt();
        int cityCnt;

        for(int i = 0; i < tCases; i++) {
            cityCnt = cityScanner(sc);
            System.out.println(cityCnt);
        }

        sc.close();
    }

    private static int cityScanner(Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();                              // clears keyboard buffer

        Set<String> inptCity = new HashSet<>();     // creates a HashSet to count how many different cities are entered

        for(int i = 0; i < n; i++) {
            inptCity.add(sc.nextLine());            // adds cities to the HashSet
        }

        return inptCity.size();
    }
}
