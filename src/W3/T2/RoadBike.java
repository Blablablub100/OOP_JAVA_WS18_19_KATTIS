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

public class RoadBike extends Bicycle{
    // In millimeters (mm)
    private int tireWidth;

    public RoadBike(int startCadence,
                    int startSpeed,
                    int startGear,
                    int newTireWidth){
        super(startCadence,
                startSpeed,
                startGear);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth(){
        return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth){
        this.tireWidth = newTireWidth;
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("The RoadBike" + " has " + getTireWidth() +
                " mm tires.");
    }
}
