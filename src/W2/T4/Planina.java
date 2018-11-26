package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Planina.java Output of the number of points stored after N iterations
 * Link: https://open.kattis.com/contests/pp5rtp/problems/planina
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/01/2018
 *
 * Method: Ad-Hoc
 * Status: Accepted
 * Runtime: 0.07
 */

public class Planina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int y = 2;
        int N;
        int res;
        boolean run;

        do {
            run = false;

            N = sc.nextInt();
            sc.nextLine();      // clears keyboard buffer

            if(N < 1 || N > 15) run = true;
        } while(run);

        // calculates how many points are on one line
        for(int i = 0; i < N; i++) {
            y = (y * 2) - 1;
        }

        // calculates the amount of points that need to be saved
        res = y * y;
        System.out.println(res);
    }
}
