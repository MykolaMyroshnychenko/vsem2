package myr.vsem.module2.factory;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class FigureFactory
 * @since 29.03.2021 - 19.24
 */

import myr.vsem.module2.factory.CutCone3;
import myr.vsem.module2.factory.Circle;
import myr.vsem.module2.factory.Cone;
import myr.vsem.module2.interfaces.iGeometry;

public class FigureFactory {

    public static iGeometry create(double height, double radius1, double radius2) {
        if (height == 0 || radius1 == radius2) {
            return new Circle(height);
        }
        if (radius1 == radius2) {
            return new Cone(radius1, height);
        }
        return new CutCone3(height, radius1, radius2);
    }

    public static iGeometry create(double radius1,double radius2, double height, Figures figure) {
        if (figure.equals(Figures.CUTCONE)) return new CutCone3((double) radius1, (double) radius2, (double) height);
        if (figure.equals(Figures.CONE)) return new Cone((double) radius1, (double) height);
        if (figure.equals(Figures.CIRCLE)) return new Circle((double) radius1);
        return null;
    }
}

