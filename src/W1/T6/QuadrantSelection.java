package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: QuadrantSelection.java
 * Link: https://open.kattis.com/contests/eu6hf6/problems/quadrant
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class QuadrantSelection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if((0 < x && x <= 1000) && (0 < y && y <= 1000)) {
            System.out.println("1");
        } else if((x < 0 && -1000 <= x) && (0 < y && y <= 1000)) {
            System.out.println("2");
        } else if((x < 0 && -1000 <= x) && (y < 0 && -1000 <= y)) {
            System.out.println("3");
        } else if((0 < x && x <= 1000) && (y < 0 && -1000 <= y)) {
            System.out.println("4");
        }
    }
}
