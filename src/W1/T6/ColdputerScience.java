package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: ColdputerScience.java count amount of numbers < 0
 * Link: https://open.kattis.com/contests/eu6hf6/problems/cold
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.08
 */

public class ColdputerScience {
    public static void main(String[] args) {

        // Scannner object is needed for user input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        // nextLine method is needed to flush "/n" out of the keyboard buffer
        sc.nextLine();
        String tempString = sc.nextLine();
        String[]  temps = tempString.split(" ");
        sc.close();

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(temps[i]) < 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
