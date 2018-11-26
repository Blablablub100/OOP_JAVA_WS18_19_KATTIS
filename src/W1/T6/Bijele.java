package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Bijele.java calculates how many pieces of each type needs to be added or removed to make a valid set
 * Link: https://open.kattis.com/contests/eu6hf6/problems/bijele
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class Bijele {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] tmp = new int[6];
        int[] res = new int[6];
        boolean run;

        do {
            run = false;

            String aInput = sc.nextLine();
            String bInput[] = aInput.split(" ");    // splits the values of aInput into bInput

            for (int i = 0; i < 6; i++) {
                tmp[i] = Integer.valueOf(bInput[i]);
                if (tmp[i] < 0 || tmp[i] > 10) run = true;
            }
        } while(run); // loops while the entered values are out of the value range

        sc.close();

        // calculates how many pieces of each type needs to be added or removed
        res[0] = 1 - tmp[0];
        res[1] = 1 - tmp[1];
        res[2] = 2 - tmp[2];
        res[3] = 2 - tmp[3];
        res[4] = 2 - tmp[4];
        res[5] = 8 - tmp[5];

        System.out.println(res[0] + " " + res[1] + " " + res[2] + " " + res[3] + " " + res[4] + " " + res[5]);
    }
}