package W3.T6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: LeftBeehind.java decides if Bill can go to the convention
 * Link: https://open.kattis.com/contests/ww2rp4/problems/leftbeehind
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/08/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.07
 */

public class LeftBeehind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> res = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        int cnt = 0;


        // runs until terminator input by user
        do {
            // user input
            String[] tmp = new String[2];
            tmp[0] = sc.nextLine();
            tmp = tmp[0].split(" ");
            x.add(Integer.valueOf(tmp[0]));
            y.add(Integer.valueOf(tmp[1]));

            // checks which output is needed
            if(x.get(cnt) + y.get(cnt) == 13) res.add(3);
            else if(x.get(cnt) > y.get(cnt)) res.add(1);
            else if(x.get(cnt) < y.get(cnt)) res.add(2);
            else if(x.get(cnt).equals(y.get(cnt))) res.add(4);

            cnt++;
        } while(!(x.get(cnt-1) == 0 && y.get(cnt-1) == 0));

        sc.close();
        cnt--;

        // console output
        for(int i = 0; i < cnt; i++) {
            if(res.get(i) == 1) System.out.println("To the convention.");
            else if(res.get(i) == 2) System.out.println("Left beehind.");
            else if(res.get(i) == 3) System.out.println("Never speak again.");
            else if(res.get(i) == 4) System.out.println("Undecided.");
        }
    }
}