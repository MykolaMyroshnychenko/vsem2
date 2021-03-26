package myr.vsem.module2.polymorphism.interfaces;

import myr.vsem.module2.polymorphism.interfaces.iGeometry;
import myr.vsem.module2.polymorphism.interfaces.iPacking;
import java.util.Objects;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class CutCone2
 * @since 25.03.2021 - 22.33
 */
public class CutCone2 implements iGeometry, iPacking {
    //creating fields
    private double radius1;
    private double radius2;
    private double height;
    //creating a constructor

    public CutCone2() {
    }

    public CutCone2(double radius1, double radius2, double height) {
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
        CutCone2 cutCone = (CutCone2) o;
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

    // implements IGeometry
    @Override
    public double getArea() {
        return Math.PI * (((Math.pow(this.radius1, 2) + Math.pow(this.radius2, 2))) +
                (this.radius1 + this.radius2) * getSlantHeight());
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * this.height * (((Math.pow(this.radius1, 2) + Math.pow(this.radius2, 2))) +
                (this.radius1 * this.radius2));
    }

    // implements IPacking
    @Override
    public String toJSON() {

        String json = "CutCone2" + "{" + "\"" + "radius1" + "\"" + ":" + this.getRadius1() +
                "," +
                "\"" + "radius2" + "\"" + ":" + this.getRadius2() +
                "," +
                "\"" + "height" + "\"" + ":" + this.getHeight() +
                "}";

        return json;
    }

    @Override
    public String toXML() {

        String xml = "<CutCone2>" +
                " + <radius1>" + this.getRadius1() + "</radius1>" +
                " + <radius2>" + this.getRadius2() + "</radius2>" +
                " + <height>" + this.getHeight() + "</height>" +
                "</CutCone2>";

        return xml;
    }
}
/*
    Result implements IGeometry:
    Area = 3710.509508832301
    Volume = 16474.511875424872

    Result implements IPacking:
    CutCone2{"radius1":12.0,"radius2":18.0,"height":23.0}
    <CutCone2> + <radius1>12.0</radius1> + <radius2>18.0</radius2> + <height>23.0</height></CutCone2>
 */

