package W2.T4;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Find out how much percent of cheese a pizza has
 * Link: https://open.kattis.com/contests/pp5rtp/problems/pizza2
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/29/2018
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.07
 */

public class PizzaCrust {

    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        sc.close();
        double c = Double.parseDouble(input[0]);
        // the radius of the crust is the total radius minus the second value
        double r = c - Double.parseDouble(input[1]);

        // calculate both areas and then output the percentage
        double areaC = Math.PI * c * c;
        double areaR = Math.PI * r * r;
        double res = areaR / areaC * 100.0;
        if (res != 100.0) {
            System.out.println(res);
        } else {
            System.out.println(0.0);
        }
    }
}
