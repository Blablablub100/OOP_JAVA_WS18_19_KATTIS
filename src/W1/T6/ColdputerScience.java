package W1.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: ColdputerScience.java
 * Link:
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class ColdputerScience {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int n = sc1.nextInt();
        int cnt = 0;

        String tempString = sc2.nextLine();
        String[]  temps = tempString.split(" ");

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(temps[i]) < 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
