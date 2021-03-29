package myr.vsem.module2.factory;

import myr.vsem.module2.polymorphism.interfaces.CutCone2;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class CutConeFactory
 * @since 29.03.2021 - 18.59
 */
public class CutConeFactory {
    public static CutCone2 create(double radius1, double radius2, double height){
        if (height == 0) {
            return  null;
        }
        if (radius1 == radius2) {
            return  null;
        }
        return new CutCone2(radius1, radius1, height);
    }
}
