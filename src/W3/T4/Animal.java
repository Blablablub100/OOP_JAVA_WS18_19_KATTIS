package W3.T4;

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