package W5.T1;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Calculates when to broadcast pizza commercial
 * Link: https://open.kattis.com/contests/ww2rp4/problems/alphabetspam
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/19/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.22
 */

public class RadioCommercials {

    public static void main(String[] args) {
        // variables
        int price;
        int pauses;
        int[] moneyPerBreak;
        // user input
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        price = Integer.parseInt(tmp[1]);
        pauses = Integer.parseInt(tmp[0]);
        moneyPerBreak = new int[pauses];
        tmp = sc.nextLine().split(" ");
        // converting to int
        for (int i = 0; i < pauses; i++) {
            // the money earned with each break, is listeners - price
            moneyPerBreak[i] = Integer.parseInt(tmp[i]) - price;
        }
        sc.close();
        // search for the sequence with max profit
        // maximum subarray problem
        System.out.println(kadane(moneyPerBreak));
    }

    // kadane algorithm
    private static int kadane(int[] moneyPerBreak)  {
        int maxSoFar = moneyPerBreak[0];
        int maxEndingHere = moneyPerBreak[0];

        for (int i = 1; i < moneyPerBreak.length; i++) {
            // calculate maxEndingHere
            if (maxEndingHere < 0) {
                maxEndingHere = moneyPerBreak[i];
            } else {
                maxEndingHere += moneyPerBreak[i];
            }
            // calculate maxSoFar
            if (maxEndingHere >= maxSoFar){
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }
}