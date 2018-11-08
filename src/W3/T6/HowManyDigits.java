package W3.T6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Calculates how many digits the factorial of a value has.
 * Link: https://open.kattis.com/problems/heliocentric
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 01/11/2018
 *
 * Method : ???
 * Status : Not Accepted
 * Runtime: ???
 */

public class HowManyDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            String fact = factorial(input);
            System.out.println(fact.length());
        }
    }

    private static String factorial(int n) {
        if (n > 10000) {
            // Sterling approximation
            int minusN = n * (-1);
            //double tmp3 = Math.pow(Math.E, minusN);
            BigDecimal tmp3 = new BigDecimal(Math.E);
            tmp3.pow(minusN*(-1));
            BigDecimal tmp2 = new BigDecimal(String.valueOf(n));
            tmp2 = tmp2.pow(n);
            BigDecimal tmp1 = new BigDecimal(String.valueOf(Math.sqrt((2 * n + (1 / 3)) * Math.PI)));
            BigDecimal tmp4 = tmp1.multiply(tmp2);
            BigDecimal res = tmp4.multiply((tmp3));
            return res.toString();
        } else {
            BigInteger res = new BigInteger("1");
            BigInteger tmp = new BigInteger(String.valueOf(n));
            BigInteger one = new BigInteger("1");
            for (n = n; n > 0; n--) {
                res = res.multiply(tmp);
                tmp = tmp.subtract(one);
            }
            return res.toString();
        }
    }
}
