package myr.vsem;

import myr.vsem.module2.CutCone;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class CutCone
 * @since 20.03.2021 - 16.28
 */

public class Main {

    public static void main(String[] args) {
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
        System.out.println(c1.getLateralSurfaceArea());
        System.out.println(c1.getTopSurfaceArea());
        System.out.println(c1.getBaseSurfaceArea());
        System.out.println(c1.getTotalSurfaceArea());
    }
}
