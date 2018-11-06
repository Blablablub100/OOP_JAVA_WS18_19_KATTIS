package W3.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Calculating the distance your finger has to travel when unlockin a device
 * locked with a pattern.
 * Link: https://open.kattis.com/contests/pp5rtp/problems/bus
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 01/11/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.07
 */

public class UnlockPattern {

    public static void main(String[] args) {
        int[][] grid = getGrid();

        double res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int d = 0; d < grid[i].length; d++) {
                int tmp = grid[i][d];
                if (tmp != 9) {
                    int[] nextLoc = getNextLoc(tmp, grid);
                    res = res + getDist(grid, new int[]{i, d}, nextLoc);
                }
            }
        }
        System.out.println(res);
    }

    // calculates distance between two locations
    public static double getDist(int[][] grid, int curr[], int[] next) {
        // is next location on a straight line?
        if (next[0] == curr[0]) {
            return  Math.abs(next[1] - curr[1]);
        } else if (curr[1] == next[1]) {
            return Math.abs(next[0] - curr[0]);
        } else {
            // if not the distance is calculated by c  = sqrt (a*a+b*b)
            double a = (double) Math.abs(curr[0] - next[0]);
            double b = (double) Math.abs(curr[1] - next[1]);
            return(Math.sqrt (a*a + b*b));
        }
    }

    // gets the location of the next number in the grid
    private static int[] getNextLoc(int curr, int[][] grid) {
        int[] loc = null;
        for (int i = 0; i < grid.length; i++) {
            for (int d = 0; d < grid[i].length; d++) {
                if (curr+1 == grid[i][d]) {
                    loc = new int[]{i, d};
                    return loc;
                }
            }
        }
        return loc;
    }

    // handles the user input and creates the grid the pattern is saved in
    private static int[][] getGrid() {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];
        for (int i = 0; i < grid.length; i++) {
            String[] input = sc.nextLine().split(" ");
            for (int d = 0; d < grid.length; d++) {
                grid[i][d] = Integer.parseInt(input[d]);
            }
        }
        sc.close();
        return grid;
    }
}
