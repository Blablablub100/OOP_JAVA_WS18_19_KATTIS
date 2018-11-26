package W3.T4;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Exercise 3 Task 4
 * Link: http://docs.oracle.com/javase/tutorial/java/IandI/override.html
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/08/2018
 *
 * Method : Ad-Hoc
 * Status : ???
 * Runtime: ???
 */

public class Animal {

    String sound = "";
    String legs = "";
    String fish = "";

    public Animal() {};

    public Animal (String sound) {
        this.sound = sound;
    }

    public Animal(String legs, String sound) {
        this.legs = legs;
        this.sound = sound;
    }

    public Animal(String legs, String sound, String fish) {
        this.legs = legs;
        this.sound = sound;
        this.fish = fish;
    }

    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }

    public void scream() {
        System.out.println("Animal deafault sound");
    }

    public static void hasLegs() {
        System.out.println("Has normally 4 legs");
    }

    public void isFish() {
        System.out.println("default");
    }

    public Object clone() {
        return new Animal(
                this.legs
                , this.sound
                , this.fish
        );
    }
}