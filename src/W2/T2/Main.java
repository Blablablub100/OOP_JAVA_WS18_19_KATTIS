package W2.T2;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Task 2
 * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/30/2018
 *
 * Method : ???
 * Status : ???
 * Runtime: ???
 */

public class Main {
    public static void main(String[] args) {

        // creates the object normalBike of the Bicycle class
        Bicycle normalBike = new Bicycle(0, 0, 1);

        // creates the object nmountainBike of the MountainBike class
        MountainBike mountainBike = new MountainBike(0, 0, 0, 0);

        System.out.println("Normal bike at start:");
        System.out.println("Speed: " + normalBike.speed);
        System.out.println("Gear: " + normalBike.gear);
        System.out.println("Cadence: " + normalBike.cadence + "\n");

        // changes the speed, gear and cadence values of normalBike
        normalBike.speedUp(15);
        normalBike.setGear(2);
        normalBike.setCadence(60);

        System.out.println("Normal bike after 2 min:");
        System.out.println("Speed: " + normalBike.speed);
        System.out.println("Gear: " + normalBike.gear);
        System.out.println("Cadence: " + normalBike.cadence + "\n");

        // changes the speed, gear and cadence values of normalBike
        normalBike.applyBrake(10);
        normalBike.setGear(1);
        normalBike.setCadence(0);

        System.out.println("Danger ahead, normal biker hits the breaks");
        System.out.println("Speed: " + normalBike.speed);
        System.out.println("Gear: " + normalBike.gear);
        System.out.println("Cadence: " + normalBike.cadence + "\n");

        // changes the speed, gear and cadence values of normalBike
        normalBike.speedUp(45);
        normalBike.setGear(3);
        normalBike.setCadence(100);

        System.out.println("Normal biker drives at maximum speed");
        System.out.println("Speed: " + normalBike.speed);
        System.out.println("Gear: " + normalBike.gear);
        System.out.println("Cadence: " + normalBike.cadence + "\n");


        System.out.println("Mountain bike at start:");
        System.out.println("Seat height: " + mountainBike.seatHeight);
        System.out.println("Speed: " + mountainBike.speed);
        System.out.println("Gear: " + mountainBike.gear);
        System.out.println("Cadence: " + mountainBike.cadence + "\n");

        // changes the speed, gear and cadence values of mountainBike
        mountainBike.speedUp(18);
        mountainBike.setGear(9);
        mountainBike.setCadence(65);

        System.out.println("Mountain biker drives slowly, to get a feel of the seats height:");
        System.out.println("Seat height: " + mountainBike.seatHeight);
        System.out.println("Speed: " + mountainBike.speed);
        System.out.println("Gear: " + mountainBike.gear);
        System.out.println("Cadence: " + mountainBike.cadence + "\n");

        // changes the seat height, speed, gear and cadence values of mountainBike
        mountainBike.setHeight(5);
        mountainBike.applyBrake(18);
        mountainBike.setGear(1);
        mountainBike.setCadence(0);

        System.out.println("Mountain biker stops and adjusts the seat height:");
        System.out.println("Seat height: " + mountainBike.seatHeight);
        System.out.println("Speed: " + mountainBike.speed);
        System.out.println("Gear: " + mountainBike.gear);
        System.out.println("Cadence: " + mountainBike.cadence + "\n");
    }
}
