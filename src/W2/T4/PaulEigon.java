package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: PaulEigon.java calculates whose turn it is to serve the ball
 * Link: https://open.kattis.com/contests/pp5rtp/problems/pauleigon
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/01/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class PaulEigon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;
        int P;
        int Q;
        int res;
        boolean run;

        do{
            run = false;

            String tmp1 = sc.nextLine();
            String[] tmp2 = tmp1.split(" ");
            N = Integer.valueOf(tmp2[0]);
            P = Integer.valueOf(tmp2[1]);
            Q = Integer.valueOf(tmp2[2]);

            if(N <= 0 || N > 1000000000 || P <= 0 || P > 1000000000 || Q <= 0 || Q > 1000000000) run = true;
        } while(run);

        // calculates whose turn it is to serve the ball
        res = ((P + Q) / N) % 2;

        if(res == 0) System.out.println("paul");
        else System.out.println("opponent");
    }
}
