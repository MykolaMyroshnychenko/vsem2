package myr.vsem.module2.polymorphism;

import java.util.Objects;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class CutCone
 * @since 20.03.2021 - 16.33
 */
public class  CutCone {
    //creating fields
    private double radius1;
    private double radius2;
    private double height;
    //creating a constructor

    public CutCone() {
    }

    public CutCone(double radius1, double radius2, double height) {
        this.radius1 = radius1;
        this.radius2 = radius2;
        this.height = height;
    }
    // getter and setter method

    public double getRadius1() {
        return radius1;
    }

    public void setRadius1(double radius1) {
        this.radius1 = radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //toString method
    @Override
    public String toString() {
        return "CutCone{" +
                "radius1=" + radius1 +
                ", radius2=" + radius2 +
                ", height=" + height +
                '}';
    }

    //equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CutCone cutCone = (CutCone) o;
        return Double.compare(cutCone.getRadius1(), getRadius1()) == 0 &&
                Double.compare(cutCone.getRadius2(), getRadius2()) == 0 &&
                Double.compare(cutCone.getHeight(), getHeight()) == 0;
    }

    //hash method
    @Override
    public int hashCode() {
        return Objects.hash(getRadius1(), getRadius2(), getHeight());
    }

    //Slant height of a conical frustum:
    public double getSlantHeight() {
        return Math.sqrt((Math.pow((this.radius1 - this.radius2), 2)) + Math.pow(this.height, 2));
    }

    //Lateral surface area of a conical frustum:
    public double getLateralSurfaceArea() {
        return Math.PI * (this.radius1 + this.radius2) * getSlantHeight();
    }

    //Top surface area of a conical frustum:
    public double getTopSurfaceArea() {
        return Math.PI * Math.pow(this.radius1, 2);
    }

    //Base surface area of a conical frustum:
    public double getBaseSurfaceArea() {
        return Math.PI * Math.pow(this.radius2, 2);
    }

    //Total surface area of a conical frustum:
    public double getTotalSurfaceArea() {
        return Math.PI * (((Math.pow(this.radius1, 2) + Math.pow(this.radius2, 2))) +
                (this.radius1 + this.radius2) * getSlantHeight());
    }
}

