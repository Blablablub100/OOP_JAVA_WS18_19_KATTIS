package W4.T1;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Exercise 4 Task 1
 * Link: https://docs.oracle.com/javase/tutorial/java/data/index.html
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/15/2018
 *
 * Method : Ad-Hoc
 * Status : ???
 * Runtime: ???
 */

public class ExponentialDemo {
    public static void main(String[] args) {
        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of " + "e is %.4f%n",
                Math.E);

        System.out.printf("exp(%.3f) " + "is %.3f%n",
                x, Math.exp(x));

        System.out.printf("log(%.3f) is " + "%.3f%n",
                x, Math.log(x));

        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n",
                x, y, Math.pow(x, y));

        System.out.printf("sqrt(%.3f) is " + "%.3f%n",
                x, Math.sqrt(x));
    }
}