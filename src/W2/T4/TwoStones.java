package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: TwoStones.java - if the entered number is even output "Bob" else "Alice"
 * Link: https://open.kattis.com/contests/pp5rtp/problems/twostones
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/01/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class TwoStones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        boolean run;


        do {
            run = false;

            String tmp1 = sc.nextLine();
            String tmp2[] = tmp1.split(" ");
            n = Integer.valueOf(tmp2[0]);

            if(n < 1 || n > 10000000) run = true;
        } while(run); // loops while the entered value is out of the value range

        sc.close();


        // checks if the entered number is even or odd
        if(n % 2 == 1) System.out.println("Alice");
        else System.out.println("Bob");
    }
}
