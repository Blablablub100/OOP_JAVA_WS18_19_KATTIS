package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: GrassSeed.java calculates the cost to sow all of the lawns
 * Link: https://open.kattis.com/contests/pp5rtp/problems/grassseed
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/30/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class GrassSeed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run;

        double C;
        int L;

        do {
            run = false;
            String tmp1 = sc.nextLine();
            String[] tmp2 = tmp1.split(" ");
            C = Double.valueOf(tmp2[0]);

            // calculates the amount of decimals
            tmp1 = Double.toString(C);
            int integerPlaces = tmp1.indexOf('.');
            int decimalPlaces = tmp1.length() - integerPlaces - 1;

            if(C <= 0 || C > 100 || decimalPlaces > 8) run = true;
        } while(run);

        do {
            run = false;

            String tmp1 = sc.nextLine();
            String[] tmp2  = tmp1.split(" ");
            L = Integer.valueOf(tmp2[0]);

            if (L <= 0 || L > 100) run = true;
        } while(run);

        double[] x = new double[L + 1];
        double[] y = new double[L + 1];
        double res = 0;

        for(int i = 0; i < L; i++) {
            do {
                run = false;

                String tmp1 = sc.nextLine();
                String[] tmp2 = tmp1.split(" ");

                x[i] = Double.valueOf(tmp2[0]);
                tmp1 = Double.toString(x[i]);
                int integerPlaces = tmp1.indexOf('.');
                int decimalPlaces = tmp1.length() - integerPlaces - 1;

                if(x[i] < 0 || x[i] > 100 || decimalPlaces > 8) run = true;

                y[i] = Double.valueOf(tmp2[1]);
                tmp1 = Double.toString(y[i]);
                integerPlaces = tmp1.indexOf('.');
                decimalPlaces = tmp1.length() - integerPlaces - 1;

                if(y[i] < 0 || y[i] > 100 || decimalPlaces > 8) run = true;
                else res += x[i] * y[i];

            } while(run);
        }

        sc.close();

        // rounds and calculates the decimal
        res = res * C;

        System.out.printf("%.7f", res);
    }
}