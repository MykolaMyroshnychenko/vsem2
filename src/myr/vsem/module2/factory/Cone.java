package myr.vsem.module2.factory;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class Cone
 * @since 29.03.2021 - 19.52
 */

import myr.vsem.module2.polymorphism.interfaces.iGeometry;

import java.util.Objects;

public class Cone implements iGeometry{

    private double radius;
    private double height;

    public Cone() {
    }

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cone cone = (Cone) o;
        return Double.compare(cone.getRadius(), getRadius()) == 0 && Double.compare(cone.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getHeight());
    }

    @Override
    public double getArea() {
        return (Math.PI * this.radius * Math.sqrt(Math.pow(this.radius,2) + Math.pow(this.height,2))) +
                (Math.PI * Math.pow(this.radius,2));
    }

    @Override
    public double getVolume() {
        return (Math.PI * Math.pow(this.radius,2) * this.height)/3;
    }
}








