package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Ladder.java calculates the needed length of the ladder in a certain angle to the ground
 * Link: https://open.kattis.com/contests/eu6hf6/problems/ladder
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class Ladder {
    public static void main(String[] args) {

        // Scannner object is needed for user input
        Scanner sc = new Scanner(System.in);

        int h; // represents the height of the wall
        int v; // represents the angle between the ladder and the ground
        double res;
        double tmp;

        do {
            h = sc.nextInt();
            if(h > 10000) {
                System.out.println("Entered height too high. Please enter a height between 1 and 10000");
            }
        } while(h > 10000);

        do {
            v = sc.nextInt();
            if(v > 89) {
                System.out.println("Entered angle too high. Please enter an angle between 1 and 89");
            }
        } while(v > 89);

        sc.close();

        // toRadians converts the angle v into Radian to get the Sinus value needed to continue calculating
        tmp = Math.sin( Math.toRadians( (double) v ) );
        res = (double)h / tmp;
        System.out.println( (int) res);
    }
}
