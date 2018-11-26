package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Sibice.java calculates is the matches fit in the box
 * Link: https://open.kattis.com/contests/pp5rtp/problems/sibice
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/30/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class Sibice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run;
        int N;
        int H;
        int W;
        double res;

        do {
            run = false;
            String tmp1 = sc.nextLine();
            String[] tmp2 = tmp1.split(" ");

            N = Integer.valueOf(tmp2[0]);
            H = Integer.valueOf(tmp2[1]);
            W = Integer.valueOf(tmp2[2]);

            if(N < 1 || N > 50 || H < 1 || H > 100 || W < 1 || W > 100) run = true;
        } while(run);

        int[] L = new int[N+1];

        for(int i = 0; i < N; i++) {
            do {
                run = false;

                String tmp1 = sc.nextLine();
                String[] tmp2 = tmp1.split(" ");
                L[i] = Integer.valueOf(tmp2[0]);

                if(L[i] < 1 || L[i] > 1000) run = true;
            } while(run);
        }

        sc.close();

        // Math.sqrt calculates the square root of the passed double value
        res = Math.sqrt( ((double)(H*H)) + ((double)(W*W)) );

        for (int i = 0; i < N; i++) {
            if((double)L[i] <= res) System.out.println("DA");
            else System.out.println("NE");
        }
    }
}
