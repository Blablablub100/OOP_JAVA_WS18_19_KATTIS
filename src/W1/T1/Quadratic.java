package W1.T1;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Quadratic.java
 * Link: http://introcs.cs.princeton.edu/java/12types/Quadratic.java.html
 * @author Clemens Tisch
 * @author YYY
 * @version 1.0, 10/23/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */


public class Quadratic {

     public static void main(String[] args) {
         double b = Double.parseDouble(args[0]);
         double c = Double.parseDouble(args[1]);

         double discriminant = b * b - 4.0 * c;

         if (discriminant <= 0) {
             System.out.println("Error division by 0");
         } else {

             double sqroot = Math.sqrt(discriminant);

             double root1 = (-b + sqroot) / 2.0;
             double root2 = (-b - sqroot) / 2.0;

             System.out.println(root1);
             System.out.println(root2);
         }
     }
}
