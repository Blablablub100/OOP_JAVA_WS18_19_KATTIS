package W3.T1;

import W2.T1.Rectangle;
import org.w3c.dom.css.Rect;

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


    }
}