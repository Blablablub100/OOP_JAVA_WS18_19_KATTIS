package W4.T6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Check which 12 teams won the contest
 * Link: https://open.kattis.com/contests/ww2rp4/problems/icpcawards
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/08/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.14
 */

public class ICPCawards {

    public static void main(String[] args) {

        String[] input = getInput();

        List<String> unis = new ArrayList<>();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String curr = input[i];
            String uni = curr.split(" ")[0];
            // add uni only if there is no other team
            if (!unis.contains(uni)) {
                res.add(curr);
                unis.add(uni);
            }
        }

        // output
        for (int i = 0; i < 12; i++) {
            System.out.println(res.get(i));
        }
    }

    // user input
    public static String[] getInput() {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        String[] input = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            input[i] = sc.nextLine();
        }
        sc.close();
        return input;
    }
}
