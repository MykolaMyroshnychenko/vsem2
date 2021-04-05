package myr.vsem.laboratoryWork2;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class SugarWeight
 * @since 04.04.2021 - 12.51
 */

import myr.vsem.laboratoryWork2.IAccounting;

public class SugarWeight implements IAccounting {
    private String name; // sugar brand name
    private String type; // type of sugar
    private double weight;
    private double priceForSugar;

    public SugarWeight(String name, String type, double weight, double priceForSugar) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.priceForSugar = priceForSugar;
    }

    public SugarWeight() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPriceForSugar() {
        return priceForSugar;
    }

    public void setPriceForSugar(double priceForSugar) {
        this.priceForSugar = priceForSugar;
    }

    @Override
    public String toString() {
        return "SugarWeight{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", priceForSugar=" + priceForSugar +
                '}';
    }

    @Override
    public double getUltimatePrice() {
        return this.getPriceForSugar() * this.getWeight();
    }
}
