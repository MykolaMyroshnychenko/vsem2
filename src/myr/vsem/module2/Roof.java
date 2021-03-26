package myr.vsem.module2;

import java.util.Objects;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class Roof
 * @since 21.03.2021 - 13.12
 */
public class Roof extends Rectangle {
    private String color;
    private String material;
    private boolean insulation;


    public Roof() {
    }

    public Roof(String color, String material, boolean insulation) {
        this.color = color;
        this.material = material;
        this.insulation = insulation;
    }

    public Roof(int length, int width, String color, String material, boolean insulation) {
        super(length, width);
        this.color = color;
        this.material = material;
        this.insulation = insulation;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isInsulation() {
        return insulation;
    }

    public void setInsulation(boolean insulation) {
        this.insulation = insulation;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "length = " + super.getLength() + '\'' +
                "width = " + super.getWidth() + '\'' +
                "color='" + this.getColor() + '\'' +
                ", material='" + this.getMaterial() + '\'' +
                ", insulation=" + this.isInsulation() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Roof roof = (Roof) o;
        return isInsulation() == roof.isInsulation() && Objects.equals(getColor(), roof.getColor()) && Objects.equals(getMaterial(), roof.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getColor(), getMaterial(), isInsulation());
    }

    public double getRoofCost() {

        double priceColor = 0;
        if (this.color == "Red") {
            priceColor = 1000;
        }
        else if (this.color == "Black") {
            priceColor = 800;
        }
            else if (this.color == "White"){
                priceColor = 1100;
        }
            else {
            priceColor = 1200;
        }

        double priceMaterial = 0;
        if (this.material == "Roof tiles") {
            priceMaterial = 120;
        }
        else if (this.material == "Slate"){
            priceMaterial = 85;
        }
        else {
            priceMaterial = 200;
        }
        double priceInsulation = 0;
        if (this.insulation == true) {
            priceInsulation = 80;
        }
        return ((super.getArea() * priceMaterial) + (super.getArea() * priceInsulation)) + priceColor;

    }
}

/*      Roof f1 = new Roof (12,15,"Red","Roof tiles",false);
        System.out.println(f1.getRoofCost());
        Roof f2 = new Roof (12,15,"White","Slate",true);
        System.out.println(f2.getRoofCost());

        result:
        22600.0
        30800.0
        */
