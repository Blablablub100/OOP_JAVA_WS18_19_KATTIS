package W4.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Apaxiaaans.java outputs all letters of the input that appears two or more times in sequence,
 *          except for the last one
 * Link: https://open.kattis.com/contests/ntt8xa/problems/apaxiaaans
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 15/08/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.07
 */

public class Apaxiaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int x = input.length();

        for(int i = 0; i < x; i++) {
            // outputs the last letter
            if(i+1 == x) System.out.println(input.charAt(i));
            // outputs letter if the next letter isn't the same
            else if (input.charAt(i) != input.charAt(i+1)) System.out.print(input.charAt(i));
        }

        sc.close();
    }
}
