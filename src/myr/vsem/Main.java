package myr.vsem;

import myr.vsem.module2.Roof;
import myr.vsem.module2.builder.MyInteger;
import myr.vsem.module2.polymorphism.interfaces.CutCone2;
import myr.vsem.module2.polymorphism.Rectangle2;
import myr.vsem.module2.builder.MyInteger;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class CutCone
 * @since 20.03.2021 - 16.28
 */

public class Main {

    public static void main(String[] args) {
  /*      CutCone c1 = new CutCone(12, 18, 23);
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

        Roof f1 = new Roof(12, 15, "Red", "Roof Tiles", true);
        f1.setWidth(18);*/


       /* Student s = new Student ("Mykola", "Myroshnychenko", "Serhiyovych", "26 Hrytsevets Street", 24.0, 1.88, 99.5, "MT4865412", "Blue", "+380997417176", "Music", "Programmer", false, "8.04.122.010.20.2", "5", "Computer science", "Information Technology", "Kots", "XA 13294828", 93.5, "Intermediate", "Java programming", "Table Tennis", "Instagram", "Ivan");
        System.out.println(s);*/

        Roof f1 = new Roof (12,15,"Red","Roof tiles",false);
        System.out.println(f1.getRoofCost());
        Roof f2 = new Roof (12,15,"White","Slate",true);
        System.out.println(f2.getRoofCost());
        Rectangle2 rec2 = new Rectangle2(3,4);
        System.out.println(rec2.toJSON());
        System.out.println(rec2.toXML());
        CutCone2 cut2 = new CutCone2(12,18,23);
        System.out.println("Area = " + cut2.getArea());
        System.out.println("Volume = " + cut2.getVolume());
        System.out.println(cut2.toJSON());
        System.out.println(cut2.toXML());


    }
}



/*
result:
12.0
18.0
CutCone{radius1=12.0, radius2=18.0, height=23.0}
false
23.769728648009426
2240.244146952278
452.3893421169302
1017.8760197630929
3710.509508832301
 */