package W3.T6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: BoatParts.java calculates if all all parts get replaced and if so on which day
 * Link: https://open.kattis.com/contests/ww2rp4/problems/boatparts
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/08/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.10
 */

public class BoatParts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creates a HashSet for checking if any parts are twice inserted
        Set<String> s = new HashSet<>(64);
        int diffParts = 0;
        int day = 0;
        int cnt = 0;

        String[] tmp = new String[2];

        tmp[0] = sc.nextLine();
        tmp = tmp[0].split(" ");
        int P = Integer.valueOf(tmp[0]);    // amount of different parts
        int N = Integer.valueOf(tmp[1]);    // days on sea

        for (int i = 0; i < N; i++) {
            cnt++;                          // counts which day it is
            tmp[0] = sc.nextLine();
            if (s.add(tmp[0])) {            // if different part is added
                diffParts++;                // boat parts check
                day = cnt;                  // actual date of replacement
            }
        }

        sc.close();

        if (diffParts == P) System.out.println(day);
        else System.out.println("paradox avoided");
    }
}