package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: QuadrantSelection.java calculates in which quadrant the point is
 * Link: https://open.kattis.com/contests/eu6hf6/problems/quadrant
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class QuadrantSelection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        boolean run;

        do {
            run = false;

            x = sc.nextInt();
            if (x < -1000 || x > 1000 || x == 0) run = true;
            y = sc.nextInt();
            if (y < -1000 || y > 1000 || y == 0) run = true;
        } while(run);   // loops until entered value is in the value range

        sc.close();

        // puts out the quadrant number where the point is placed
        if((x > 0) && (y > 0)) {
            System.out.println("1");
        } else if((x < 0) && (y > 0)) {
            System.out.println("2");
        } else if(x < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
