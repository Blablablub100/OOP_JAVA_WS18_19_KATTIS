package W3.T6;

import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Checks whether a number is a happy prime
 * Link: https://open.kattis.com/problems/happyprime
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/08/2018
 *
 * Method : Ad-Hoc
 * Status : Accepted
 * Runtime: 0.36
 */

public class HappyPrime {

    public static void main(String[] args) {
        TestCase[] input = getTestCases();

        for (int i = 0; i < input.length; i++) {
            if (isHappy(input[i].candidate) && isPrime(input[i].candidate)) {
                System.out.println(input[i].toString() + "YES");
            } else {
                System.out.println(input[i].toString() + "NO");
            }
        }
    }

    private static boolean isHappy(int n) {
        int cnt = 1;
        while (n != 1) {
            // if happyness is tested 10 times, the number is considered unhappy
            if (cnt == 10) return false;
            String s = String.valueOf(n);
            n = 0;
            // iterates through each number in the String
            for (int i = 0; i < s.length(); i++) {
                int tmp = Character.getNumericValue(s.charAt(i));
                n = n + tmp*tmp;
            }
            cnt ++;
        }
        return true;
    }

    private static boolean isPrime(int n) {
        if (n == 1) return false;
        for(int i=2; i<=n/2; i++) {
            int tmp = n%i;
            //if tmp is 0 than numberToCheckber is not prime and return flase. Else continue loop
            if(tmp==0) {
                return false;
            }
        }
        return true;
    }

    private static TestCase[] getTestCases() {
        Scanner sc = new Scanner(System.in);
        int amt = Integer.parseInt(sc.nextLine());
        TestCase[] input = new TestCase[amt];

        for (int i = 0; i < amt; i++) {
            String[] tmp = sc.nextLine().split(" ");
            input[i] = new TestCase(tmp[0], tmp[1]);
        }
        sc.close();
        return input;
    }
}

class TestCase {
    public int number;
    public int candidate;

    public TestCase(String number, String candidate) {
        this.number = Integer.parseInt(number);
        this.candidate = Integer.parseInt(candidate);
    }

    public String toString() {
        return (number + " " + candidate + " ");
    }
}
