package W5.T1;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Checks if 8 queens are placed on a chess board correctly
 * Link: https://open.kattis.com/problems/kitten
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/22/2018
 *
 * Method : Ad-Hoc
 * Status : Not Accepted
 * Runtime: ???
 */

import java.util.Scanner;

public class Kitten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = new String[102];

        String start = sc.nextLine();

        int cnt = 0;

        while(true) {
            input[cnt] = sc.nextLine();
            if(input[cnt].contains("-1")) break;
            cnt++;
        }

        System.out.print(start + " ");

        for (int i = 0; i < cnt; i++) {
            if(input[i].contains(" " + start)) {
                String[] tmp = input[i].split(" ");
                System.out.print(tmp[0] + " ");
                start = tmp[0];
                i = -1;
            }
        }
    }
}