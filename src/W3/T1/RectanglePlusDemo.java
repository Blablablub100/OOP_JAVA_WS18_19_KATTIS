package W3.T1;

import java.awt.*;

public class RectanglePlusDemo {
    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        RectanglePlus RP1 = new RectanglePlus();
        RectanglePlus RP2 = new RectanglePlus(new Point(2,3));
        RectanglePlus RP3 = new RectanglePlus(5,7);
        RectanglePlus RP4 = new RectanglePlus(p1, 5, 7);

        System.out.println("RP1 location: x = " + RP1.origin.x + ", y = " + RP1.origin.y);
        RP1.move(-2, -3);
        System.out.println("RP1 new location: x = " + RP1.origin.x + ", y = " +RP1.origin.y);
        System.out.println("RP2 location: x = " + RP2.origin.x + ", y = " + RP2.origin.y);
        System.out.println("Area of RP3: " + RP3.getArea());
        System.out.println("Area of RP4: " + RP4.getArea());

        if(RP3.isLargerThan(RP4) == -1) System.out.println("RP4 is larger than RP3.");
        else if(RP3.isLargerThan(RP4) == 0) System.out.println("RP3 and RP4 have the same size.");
        else System.out.println("RP3 is larger than RP4.");

        RP1 = (RectanglePlus) RP4.clone();
        System.out.println("RP1 is now a clone of RP4");
        System.out.println("RP1 location: x = " + RP1.origin.x + ", y = " + RP1.origin.y);
        System.out.println("RP4 location: x = " + RP4.origin.x + ", y = " + RP4.origin.y);
        System.out.println("Area of RP1: " + RP1.getArea());
        System.out.println("Area of RP4: " + RP4.getArea());

        if (!RP1.equals(RP4)) {
            System.out.println("RP1 and RP4 are pointing to different Objects");
        }

        Class t = RP4.getClass();
        System.out.println("Class object of RP4: "+t.toString());

        int hash = RP4.hashCode();
        System.out.println("Hash of RP4: "+hash);

        System.out.println("String of RP4: "+RP4.toString());

        Object tmp = RP2.clone();
        if (tmp instanceof RectanglePlus) {
            System.out.println("tmp is a RectanglePlus");
            RP1 = (RectanglePlus) tmp;
        }
    }
}