package W4.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Conundrum.java calculates how many days it takes until every letter is changed to 'P', 'E' or 'R'
 * Link: https://open.kattis.com/contests/ntt8xa/problems/conundrum
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 15/08/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.07
 */

public class Conundrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int cnt = 0;

        // checks if the length is a multiple of 3
        if(((input.length()%3) == 0)) {
            for(int i = 0; i < input.length(); i++) {

                // checks if a letter needs to be changed and if so increases the counter
                if(input.charAt(i) != 'P') cnt++;
                i++;
                if(input.charAt(i) != 'E') cnt++;
                i++;
                if(input.charAt(i) != 'R') cnt++;
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}
