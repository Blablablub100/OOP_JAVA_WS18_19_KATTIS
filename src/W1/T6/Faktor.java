package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Faktor.java
 * Link: https://open.kattis.com/contests/eu6hf6/problems/faktor
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.07
 */

public class Faktor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean run;
        int A;
        int I;
        int res;

        // loops while the entered values are out of the value range
        // splits the values of the entered string into other Strings to get the values out of the Strings
        do {
            run = false;

            String inpt;
            inpt = sc.nextLine();
            String tmp[] = inpt.split(" ");

            A = Integer.valueOf(tmp[0]);
            I = Integer.valueOf(tmp[1]);

            if( A < 1 || I < 1 || A > 100 || I > 100 ) run = true;
        } while(run);

        res = ((I - 1) * A) + 1;    // calculates the result

        System.out.println(res);
    }
}
