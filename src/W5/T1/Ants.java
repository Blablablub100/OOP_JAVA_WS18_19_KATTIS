package W5.T1;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Calculates when Ants fall of a pole
 * Link: https://open.kattis.com/contests/ww2rp4/problems/ants
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/22/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.62
 */

public class Ants {

    public static void main(String[] args) {

        TestCase[] input = getInput();

        for (TestCase c: input) {
            // dists[1] = maximum distance to fall of, dists[0] minimum
            int[][] dists = getDistances(c);
            // output minimum time
            System.out.print(getMax(dists[1]) + " ");
            // output maximum time
            System.out.println(getMax(dists[0]));
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int tmp : arr) {
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }

    // return array of min/ max distances to pole
    private static int[][] getDistances(TestCase c) {
        int[] maxDists = new int[c.numOfAnts];
        int[] minDists = new int[c.numOfAnts];

        for (int i = 0; i < c.numOfAnts; i++) {
            int dist1 = Math.abs(c.length - c.antLoc[i]);
            int dist2 = Math.abs(c.antLoc[i] - 0);
            if (dist1 > dist2) {
                maxDists[i] = dist1;
                minDists[i] = dist2;
            } else if (dist1 < dist2) {
                maxDists[i] = dist2;
                minDists[i] = dist1;
            } else if (dist1 == dist2) {
                maxDists[i] = dist1;
                minDists[i] = dist1;
            }
        }
        int[][] res = {maxDists, minDists};
        return res;
    }

    // gets user Input, and returns TestCase Objects
    private static TestCase[] getInput() {
        TestCase[] cases;
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        cases = new TestCase[cnt];

        for (int i = 0; i < cnt; i++) {
            TestCase tmp = new TestCase();
            tmp.length = sc.nextInt();
            tmp.numOfAnts = sc.nextInt();
            int[] locs = new int[tmp.numOfAnts];
            for (int j = 0; j < tmp.numOfAnts; j++) {
                locs[j] = sc.nextInt();
            }
            tmp.antLoc = locs;
            cases[i] = tmp;
        }

        sc.close();
        return cases;
    }
}

class TestCase {
    int length;
    int numOfAnts;
    int[] antLoc;
}