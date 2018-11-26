package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Find the best Parking spot for Micheal
 * Link: https://open.kattis.com/contests/pp5rtp/problems/parking2
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/29/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.09
 */

public class Parking {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine());
        TestCase[] cases = getTestCases(amount);

        for (int i = 0; i < cases.length; i++) {
            int middlePoint = getPoint(cases[i]);
            System.out.println(getDistance(cases[i], middlePoint));
        }
    }

    private static int getDistance(TestCase testCase, int point) {
        // walks from car to minimum store, then to maximum, then back to car
        int min = testCase.storeLocs[0];
        int max = testCase.storeLocs[0];
        for (int storeLoc : testCase.storeLocs) {
            if (storeLoc < min) {
                min = storeLoc;
            } else if (storeLoc > max) {
                max = storeLoc;
            }
        }
        int res = (point-min) + (max-min) + (max-point);
        return res;
    }

    private static int calculateMiddlePoint(int a, int b) {
        if (a > b) {
            return ((a-b)/2) + b;
        } else if (a < b) {
            return ((b-a)/2) + a;
        }
        return a;
    }

    // calculates the optimal parking sport for Micheal
    private static int getPoint(TestCase testCase) {
        if (testCase.storeLocs.length == 1) return testCase.storeLocs[0];
        int stores = testCase.stores-1;
        int[] locs = new int[stores];
        for (int i = 0; i < testCase.stores-1; i++) {
            locs[i] = calculateMiddlePoint(testCase.storeLocs[i]
                    , testCase.storeLocs[i+1]);
        }
        return getPoint(new TestCase(locs));
    }

    // reads in all TestCases
    private static TestCase[] getTestCases(int amount) {
        TestCase[] cases = new TestCase[amount];
        for (int i = 0; i < amount; i++) {
            cases[i] = getTestCase();
        }
        return cases;
    }


    private static TestCase getTestCase() {
        int stores = Integer.parseInt(sc.nextLine());
        String[] locsString = sc.nextLine().split(" ");
        int[] locs = new int[locsString.length];

        for (int i = 0; i < locs.length; i++) {
            locs[i] = Integer.parseInt(locsString[i]);
        }
        return new TestCase(locs);
    }
}

class TestCase {
    int stores;
    int[] storeLocs;

    TestCase(int[] storeLocs) {
        this.storeLocs = storeLocs;
        stores = storeLocs.length;
    }
}
