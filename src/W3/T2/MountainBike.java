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

public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(
            int startCadence,
            int startSpeed,
            int startGear,
            String suspensionType){
        super(startCadence,
                startSpeed,
                startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension(){
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a " +
                getSuspension() + " suspension.");
    }
}