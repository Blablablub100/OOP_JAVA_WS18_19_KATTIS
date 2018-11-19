package W5.T1;

import java.util.Scanner;

public class Ants {

    public static void main(String[] args) {

        TestCase[] input = getInput();

        for (TestCase c: input) {
            int minTime = 0;
            int maxTime = 0;

            // output minimum
            int[] dists = getDistances(c);
            System.out.println(getMax(dists));
        }
        //TODO DO MAXIMUM TOO
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

    private static int[] getDistances(TestCase c) {
        int[] dists = new int[c.numOfAnts];
        for (int i = 0; i < c.numOfAnts; i++) {
            int dist = Math.abs(c.length - c.antLoc[i]);
            dists[i] = dist;
        }
        return dists;
    }

    private static TestCase[] getInput() {
        TestCase[] cases = null;
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