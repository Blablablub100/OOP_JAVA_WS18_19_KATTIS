package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: JustAMinute.java calculates how long a Super Lag minute is
 * Link: https://open.kattis.com/contests/eu6hf6/problems/justaminute
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.13
 */

public class JustAMinute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean run;
        int cnt;

        do {
            run = false;
            cnt = sc.nextInt();
            if (cnt < 1 || cnt > 1000) run = true;
        } while (run);                          // loops while the entered value is out of the value range

        String aTime;
        double[] bTime = new double[cnt*2];     // creates a String array big enough for each entered value
        sc.nextLine();                          // clears keyboard puffer

        double aRes = 0;
        double bRes = 0;
        double endRes;
        int bIndex = 0;

        // loops while the entered values are out of the value range
        // splits the values of the entered string into other Strings to get the values out of the Strings
        do {
            run = false;
            for (int i = 0; i < cnt; i++) {
                aTime = sc.nextLine();
                String[] tmp = aTime.split(" ");
                bTime[bIndex] = Double.valueOf(tmp[0]);
                if (bTime[bIndex] < 0 || bTime[bIndex] > 60) run = true;
                bIndex++;
                bTime[bIndex] = Double.valueOf(tmp[1]);
                if (bTime[bIndex] < 0 || bTime[bIndex] > 3600) run = true;
                bIndex++;
            }
        } while (run);

        sc.close();

        for (int i = 0; i < bIndex; i++) {
            bRes = bRes + bTime[i];             // counts all the entered S.L. minutes together
            i++;
            aRes = aRes + bTime[i];             // counts all the entered real time seconds together
        }
        endRes = aRes / (bRes * 60);            // calculates the average length of an S.L. minute, measured in real minutes

        // prints out error when the value of the result is 1 or lower otherwise the result
        if (endRes <= 1) {
            System.out.println("measurement error");
        } else {
            System.out.println(endRes);
        }
    }
}
