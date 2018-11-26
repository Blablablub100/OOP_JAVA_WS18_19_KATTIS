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
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class Ladder {
    public static void main(String[] args) {

        // Scannner object is needed for user input
        Scanner sc = new Scanner(System.in);

        String inpt;
        int h;
        int v;
        double res;
        boolean run;

        do {
            run = false;

            inpt = sc.nextLine();
            String[] tmp = inpt.split(" ");

            h = Integer.valueOf(tmp[0]);
            if(h < 1 || h > 10000) run = true;

            v = Integer.valueOf(tmp[1]);
            if(v < 1 || v > 89) run = true;
        } while(run);   // runs while the input is higher or lower then the accepted values for h and v

        sc.close();

        // toRadians converts the angle v into Radian to get the Sinus value needed to continue calculating
        res = Math.sin( Math.toRadians( (double)v ));
        res = h / res;

        // rounds up the value of res and casts it into an int to output correctly
        System.out.println((int)Math.ceil(res));
    }
}
