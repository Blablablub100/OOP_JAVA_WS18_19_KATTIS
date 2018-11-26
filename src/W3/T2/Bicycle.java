package W3.T2;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Exercise 3 Task 2
 * Link: https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/08/2018
 *
 * Method : Ad-Hoc
 * Status : ???
 * Runtime: ???
 */

public class Bicycle {

    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.gear
                + " with a cadence of " + this.cadence +
                " and travelling at a speed of " + this.speed + ". ");
    }

    public Object clone() {
        return new Bicycle(
                this.cadence
                , this.speed
                , this.gear
        );
    }

    public String toString() {
        String res = "";
        res = res + "Cadence: " + cadence;
        res = res + ", Speed: " + speed;
        res = res + ", Gear: " + gear;
        return res;
    }
}