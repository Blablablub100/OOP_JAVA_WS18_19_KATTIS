package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Find the fourth point of square
 * Link: https://open.kattis.com/contests/pp5rtp/problems/completingthesquare
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : Not Accepted
 * Runtime: ???
 */

public class CompletingTheSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Point a = readPoint(sc);
        Point b = readPoint(sc);
        Point c = readPoint(sc);
        sc.close();

        int distAB = getDistance(a, b);
        int distBC = getDistance(b, c);
        int distAC = getDistance(a, c);

        Point res = new Point(0, 0);
        if (distAB > distBC && distAB > distAC) {
            int x = c.x + Math.abs(b.y-a.y);
            int y = c.y + Math.abs(b.x-a.x);
            res = new Point(x, y);
        } else if (distBC > distAB && distBC > distAC) {
            int x = a.x + Math.abs(c.y-b.y);
            int y = a.y + Math.abs(c.x-b.x);
            res = new Point(x, y);
        } else if (distAC > distAB && distAC > distBC) {
            int x = b.x + Math.abs(a.y - c.y);
            int y = b.y + Math.abs(a.x - c.x);
            res = new Point(x, y);
        } else {
            System.out.println("ERROR!");
        }

        System.out.println(res.x + " "+res.y);
    }

    private static int getDistance(Point a, Point b) {
        return(Math.abs(a.x - b.x)
                + Math.abs(a.y - b.y));
    }

    private static Point readPoint(Scanner sc) {
        String[] input = sc.nextLine().split(" ");
        return (new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
    }
}

class Point {
    public int x;
    public int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
