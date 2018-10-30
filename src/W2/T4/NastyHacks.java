package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: NastyHacks.java calculating if its worth to advertise a product
 * Link: https://open.kattis.com/contests/pp5rtp/problems/nastyhacks
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/30/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.09
 */

public class NastyHacks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run;
        int n;

        do {
            run = false;

            n = sc.nextInt();
            sc.nextLine(); // clears keyboard buffer

            if(n < 1 || n > 100) run = true;
        } while (run); // loops while the entered value is out of the value range

        int[] r = new int[n+1];
        int[] e = new int[n+1];
        int[] c = new int[n+1];

        for(int i = 0; i < n; i++) {
            do {
                run = false;
                String tmp1 = sc.nextLine();
                String[] tmp2 = tmp1.split(" ");

                r[i] = Integer.valueOf(tmp2[0]);
                e[i] = Integer.valueOf(tmp2[1]);
                c[i] = Integer.valueOf(tmp2[2]);

                if (r[i] < -1000000 || r[i] > 1000000) run = true;
                if (e[i] < -1000000 || e[i] > 1000000) run = true;
                if (c[i] < 0 || c[i] > 1000000) run = true;
            } while (run); // loops while the entered values are out of the value range
        }

        for(int i = 0; i < n; i++) {

            // calculates and compares values to output if it's worth to use advertisement
            int tmp = e[i] - c[i];
            if(tmp < r[i]) System.out.println("do not advertise");
            else if(tmp > r[i]) System.out.println("advertise");
            else System.out.println("does not matter");
        }
    }
}
