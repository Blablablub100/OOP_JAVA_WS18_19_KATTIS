package W2.T1;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Main.java
 * Link: exercises02.pdf
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/25/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class Main {
    public static void main(String[] args) {

        // declare and create one point and four rectangle objects
        Point firstPoint = new Point( 5, 7 );
        Rectangle firstRec = new Rectangle();
        Rectangle secondRec = new Rectangle( firstPoint );
        Rectangle thirdRec = new Rectangle( 66, 80 );
        Rectangle fourthRec = new Rectangle( firstPoint, 58, 10);

        // output of firstRec's origin (x|y), width, height and area
        System.out.println("P (" + firstRec.origin.x + "|" + firstRec.origin.y + ")");
        System.out.println("Width of firstRec: " + firstRec.width);
        System.out.println("Height of firstRec: " + firstRec.height);
        System.out.println("Area of firstRec: " + firstRec.getArea() + "\n");

        // output of secondRec's origin (x|y), width, height and area
        System.out.println("P (" + secondRec.origin.x + "|" + secondRec.origin.y + ")");
        System.out.println("Width of secondRec: " + secondRec.width);
        System.out.println("Height of secondRec: " + secondRec.height);
        System.out.println("Area of secondRec: " + secondRec.getArea() + "\n");

        // output of thirdRec's origin (x|y), width, height and area
        System.out.println("P (" + thirdRec.origin.x + "|" + thirdRec.origin.y + ")");
        System.out.println("Width of thirdRec: " + thirdRec.width);
        System.out.println("Height of thirdRec: " + thirdRec.height);
        System.out.println("Area of thirdRec: " + thirdRec.getArea() + "\n");

        // output of fourthRec's origin (x|y), width, height and area
        System.out.println("P (" + fourthRec.origin.x + "|" + fourthRec.origin.y + ")");
        System.out.println("Width of fourthRec: " + fourthRec.width);
        System.out.println("Height of fourthRec: " + fourthRec.height);
        System.out.println("Area of fourthRec: " + fourthRec.getArea() + "\n");

        // moves firstRec's origin.x and origin.y
        firstRec.move(3, 6);

        // output of firstRec's new origin.x and origin.y
        System.out.println("P (" + firstRec.origin.x + "|" + firstRec.origin.y + ")");

        // set new point for thirdRec origin
        thirdRec.origin = firstPoint;

        // output of thirdRec's new origin.x and origin.y
        System.out.println("P (" + thirdRec.origin.x + "|" + thirdRec.origin.y + ")");
    }
}
