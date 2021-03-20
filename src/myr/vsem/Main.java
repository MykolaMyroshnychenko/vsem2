package myr.vsem;

import myr.vsem.module2.CutCone;
import myr.vsem.module2.Rectangle;

public class Main {

    public static void main(String[] args) {

        /*Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle();
        int l1 = r1.getLength();
        System.out.println(l1);
        r2.setLength(12);
        r2.setWidth(21);
        int l2 = r2.getLength();
        System.out.println(l2);
        System.out.println(r2.toString());
        Rectangle r3 = new Rectangle(12,21);
        System.out.println(r3.equals(r2));
        System.out.println(r3.equals(r1));
        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());
        System.out.println(r1.getArea());*/

        CutCone c1 = new CutCone(12, 18, 23);
        double r1 = c1.getRadius1();
        System.out.println(r1);
        CutCone c2 = new CutCone();
        c2.setRadius2(18);
        double r2 = c2.getRadius2();
        System.out.println(r2);
        System.out.println(c1.toString());
        System.out.println(c2.equals(c1));
        System.out.println(c1.getSlantHeight());


    }
}
