package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Jabuke.java Calculate how many apple trees are on ones lawn
 * Link: https://open.kattis.com/contests/eu6hf6/problems/yoda
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.08s
 */

public class Jabuke {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] tri = getTriangle();
        int amount = Integer.valueOf(sc.nextLine());
        int[][] treeLocs = getTreeLocs(amount);
        double area = calcArea(tri);

        System.out.format("%.1f", area);

        int cnt = 0;
        for (int i = 0; i < amount; i++) {
            if (treeOnTri(tri, treeLocs[i], area)) cnt++;
        }
        System.out.println("\n"+cnt);
    }

    // checks if tree is on Triangle true if yes, false if not
    private static boolean treeOnTri(int[][] tri, int[] tree, double area) {
        // splits the triangle in 3 small triangles
        int[][] tri1 = new int[][] {
                tree, tri[0], tri[1]
        };
        int[][] tri2 = new int[][] {
                tree, tri[1], tri[2]
        };
        int[][] tri3 = new int[][] {
                tree, tri[2], tri[0]
        };
        double a1 = calcArea(tri1);
        double a2 = calcArea(tri2);
        double a3 = calcArea(tri3);

        // if the sum of the areas of the 3 triangles is the same as the area of the triangle
        // , the point is on the triangle
        return (area == (a1+a2+a3));
    }

    // returns the size of a triangle
    private static double calcArea(int[][] tri) {
        double t1 = (double) (tri[0][0] * (tri[1][1]-tri[2][1]));
        double t2 = (double) (tri[1][0] * (tri[2][1]-tri[0][1]));
        double t3 = (double) (tri[2][0] * (tri[0][1]-tri[1][1]));
        return Math.abs(((t1+t2+t3)/2));
    }

    // lets the user input a triangle
    private static int[][] getTriangle() {
        int[][] tri = new int[3][];
        for (int i = 0; i < tri.length; i++) {
            tri[i] = getCoordinate();
        }
        return tri;
    }

    // lets the user input a coordinate
    private static int[] getCoordinate() {
        String[] temp = sc.nextLine().split(" ");
        int[] res = new int[2];
        res[0] = Integer.valueOf(temp[0]);
        res[1] = Integer.valueOf(temp[1]);
        return res;
    }

    // lets the user input the tree locations
    private static int[][] getTreeLocs(int amount) {
        int[][] treeLocs = new int[amount][];
        for (int i = 0; i < amount; i++) {
            treeLocs[i] = getCoordinate();
        }
        return treeLocs;
    }
}

