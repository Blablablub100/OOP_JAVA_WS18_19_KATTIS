package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Find the fourth point of square
 * Link: https://open.kattis.com/contests/pp5rtp/problems/completingthesquare
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/01/2018
 *
 * Method : Ad-Hoc
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

        double distAB = getDistance(a, b);
        double distBC = getDistance(b, c);
        double distAC = getDistance(a, c);

        Point res = new Point(0, 0);
        if (distAB > distBC && distAB > distAC) {
            Line bc = getLine(b,c);
            bc.moveTo(a);
            Line ac = getLine(a,c);
            ac.moveTo(b);
            res = getCrossing(bc, ac);
            /*int x = c.x + Math.abs(b.y-a.y);
            int y = c.y + Math.abs(b.x-a.x);
            res = new Point(x, y);*/
        } else if (distBC > distAB && distBC > distAC) {
            Line ab = getLine(a,b);
            ab.moveTo(c);
            Line ac = getLine(a,c);
            ac.moveTo(b);
            res = getCrossing(ab, ac);
            /*int x = a.x + Math.abs(c.y-b.y);
            int y = a.y + Math.abs(c.x-b.x);
            res = new Point(x, y);*/
        } else if (distAC > distAB && distAC > distBC) {
            Line ab = getLine(a,b);
            ab.moveTo(c);
            Line bc = getLine(b,c);
            bc.moveTo(a);
            res = getCrossing(ab, bc);
            /*
            int x = b.x + Math.abs(a.y - c.y);
            int y = b.y + Math.abs(a.x - c.x);
            res = new Point(x, y);*/
        } else {
            System.out.println("ERROR!");
        }

        System.out.println(res.x + " "+res.y);
    }

    private static Point getCrossing(Line l1, Line l2) {
        int x = (int) ((l2.b-l1.b) / (l1.m-l2.m));
        int y = (int) (l1.m * ((l2.b-l1.b)/(l1.m-l2.m))+l1.b);
        return new Point(x, y);
    }

    private static Line getLine(Point a, Point b) {
        double m = (((double)(b.y - a.y)) / ((double)(b.x - a.x)));
        double bl = a.y - (m*a.x);
        return new Line(m, bl);
    }

    private static double getDistance(Point a, Point b) {
        double dis = Math.sqrt((b.x-a.x)*(b.x-a.x) + (b.y-a.y)*(b.y-a.y));
        return(dis);
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

class Line {
    public double m;
    public double b;

    public Line(double m, double b) {
        this.m = m;
        this.b = b;
    }

    public void moveTo(Point p) {
        b = (double) p.y - (m* (double)p.x);
    }
}