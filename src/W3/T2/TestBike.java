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

public class TestBike {

    public static void main(String[] args) {
        int startCadence = 0;
        int startGear = 1;
        int startSpeed = 0;
        int standardTireWidth = 25;
        String standardSuspension = "dual";

        System.out.println("bike0 (Bicycle) is being created.");

        Bicycle bike0 = new Bicycle(startCadence, startSpeed, startGear);

        bike0.setCadence(60);
        bike0.setGear(3);
        bike0.speedUp(30);
        bike0.applyBrake(5);

        bike0.printDescription();

        Object tmp0 = bike0.clone();

        if (!bike0.equals(tmp0)) {
            System.out.println("\nbike0 and tmp0 are pointing to different Objects");
        }

        if (tmp0 instanceof Bicycle) {
            System.out.println("\ntmp0 is a Bicycle");
            bike0 = (Bicycle) tmp0;
        }
        bike0.printDescription();

        Class t0 = bike0.getClass();
        System.out.println("\nClass object of bike0: " + t0.toString());

        int hash = bike0.hashCode();
        System.out.println("\nHash of bike0: " + hash);

        System.out.println("\nString of bike0: " + bike0.toString());


        System.out.println("\n\nbike1 (Mountain Bike) is being created.");
        MountainBike bike1 = new MountainBike(startCadence, startSpeed, startGear, standardSuspension);
        bike1.printDescription();


        System.out.println("\n\nbike2 (Road Bike) is being created.");
        RoadBike bike2 = new RoadBike(startCadence, startSpeed, startGear, standardTireWidth);
        bike2.printDescription();
    }
}
