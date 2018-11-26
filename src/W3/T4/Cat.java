package W3.T4;

public class Cat extends Animal {

    String sound;
    String legs;
    String fish;

    public Cat () {};

    public Cat (String sound) {
        this.sound = sound;
    }

    public Cat (String legs, String sound) {
        this.legs = legs;
        this.sound = sound;
    }

    public Cat (String legs, String sound, String fish) {
        this.legs = legs;
        this.sound = sound;
        this.fish = fish;
    }

    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public void scream() {
        System.out.println("Miau");
    }

    public static void hasLegs() {
        System.out.println("A Cat has 4 legs");
    }

    public void isFish() {
        System.out.println("No Fish");
    }

    public static void main(String[] args) {

        String sound = "nein";
        String legs = "has four legs";
        String isFish = "A cat is not a fish";

        Cat myCat = new Cat(sound);
        Animal myAnimal = myCat;
        myAnimal.scream();
        myCat.scream();

        Cat myCat2 = new Cat(legs, sound);
        Animal myAnimal2 = myCat2;
        myAnimal2.hasLegs();
        myCat2.hasLegs();

        Cat myCat3 = new Cat(legs, sound, isFish);
        Animal myAnimal3 = myCat3;
        myAnimal3.isFish();
        myCat3.isFish();

        Animal testAnimal = new Animal();
        Cat testCat = new Cat();

        Object tmp = myAnimal3.clone();

        if (!myAnimal3.equals(tmp)) {
            System.out.println("\nmyAnimal3 and tmp are pointing to different Objects");
        }

        if (tmp instanceof Animal) {
            System.out.println("tmp is an Animal");
            myAnimal3 = (Animal) tmp;
        }

        Class tmp1 = myAnimal3.getClass();
        System.out.println("Class object of myAnimal3: " + tmp1.toString());

        int hash = myAnimal3.hashCode();
        System.out.println("Hash of myAnimal3: " + hash);

        System.out.println("String of myAnimal3: " + myAnimal3.toString() + "\n");

        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}