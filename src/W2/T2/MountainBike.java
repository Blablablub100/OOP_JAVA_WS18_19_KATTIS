package W2.T2;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Task 2
 * Link: http://docs.oracle.com/javase/tutorial/java/javaOO
 * /classes.html
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 10/25/2018
 *
 * Method : Ad-Hoc
 * Status : ???
 * Runtime: ???
 */

public class MountainBike extends Bicycle {

    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

}
