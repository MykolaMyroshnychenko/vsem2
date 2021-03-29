package myr.vsem.module2.factory;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class Circle
 * @since 29.03.2021 - 19.29
 */
import myr.vsem.module2.interfaces.iGeometry;

import java.util.Objects;


public class Circle implements iGeometry {


    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public double getVolume() {
        return 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}






