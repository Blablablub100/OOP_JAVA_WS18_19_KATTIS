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

public class ValueOfDemo {
    public static void main(String[] args) {

        // this program requires two
        // arguments on the command line
        if (args.length == 2) {
            // convert strings to numbers
            float a = (Float.valueOf(args[0])).floatValue();
            float b = (Float.valueOf(args[1])).floatValue();

            // do some arithmetic
            System.out.println("a + b = " +
                    (a + b));
            System.out.println("a - b = " +
                    (a - b));
            System.out.println("a * b = " +
                    (a * b));
            System.out.println("a / b = " +
                    (a / b));
            System.out.println("a % b = " +
                    (a % b));
        } else {
            System.out.println("This program " +
                    "requires two command-line arguments.");
        }
    }
}