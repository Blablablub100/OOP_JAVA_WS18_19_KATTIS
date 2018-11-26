package W5.T1;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Checks if 8 queens are placed on a chess board correctly
 * Link: https://open.kattis.com/contests/ww2rp4/problems/queens
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/22/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.15
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        int n = sc.nextInt();
        sc.nextLine();

        // creates several HashSets to check if a queen is already placed in the same line or diagonal
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        Set<Integer> res1 = new HashSet<>();
        Set<Integer> res2 = new HashSet<>();

        // runs for entered n
        for(int i = 0; i < n; i++) {
            String tmp1 = sc.nextLine();
            String[] tmp2 = tmp1.split(" ");

            if(!(x.add(Integer.valueOf(tmp2[0])))) {
                run = false;
                break;
            }
            if(!(y.add(Integer.valueOf(tmp2[1])))) {
                run = false;
                break;
            }

            if(!(res1.add(Integer.valueOf(tmp2[0]) - Integer.valueOf(tmp2[1])))) {
                run = false;
                break;
            }

            if(!(res2.add(Integer.valueOf(tmp2[0]) + Integer.valueOf(tmp2[1])))) {
                run = false;
                break;
            }
        }

        // output
        if(run) System.out.println("CORRECT");
        else System.out.println("INCORRECT");
    }
}