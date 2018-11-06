package W3.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Calculates in how many days the earth and the mars are at day 0
 * Link: https://open.kattis.com/problems/heliocentric
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 01/11/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.08
 */

public class Heliocentric {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = 1;

        // unlimited amount of inputs, therefore running as long as input is coming
        while(sc.hasNextInt()) {
            int earth = sc.nextInt();
            int mars = sc.nextInt();

            // counter for the days
            int cnt = 0;
            // check if day is day searched for, if not keep searching
            while (!(earth == 0 && mars == 0)) {
                earth++;
                mars++;
                if (earth > 364) earth = 0;
                if (mars > 686) mars = 0;
                cnt++;
            }
            System.out.println("Case "+testCase+": "+cnt);
            testCase++;
        }
        sc.close();
    }
}
