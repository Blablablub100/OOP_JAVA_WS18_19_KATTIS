package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Hissing.java
 * Link: https://open.kattis.com/contests/pp5rtp/problems/hissingmicrophone
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/01/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class Hissing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = false;

        String input1 = sc.nextLine();      // String input for double s check
        sc.close();
        int n = input1.length();

        char[] input = new char[n];
        input1.getChars(0, n, input, 0);    // extracts the chars out of the String

        // checks for double s
        for(int i = 0; i < (n-1); i++) {
            if(input[i] == 's') {
                if(input[i+1] == 's') {
                    run = true;
                    break;
                }
            }
        }

        // output
        if(run) System.out.println("hiss");
        else System.out.println("no hiss");
    }

}
