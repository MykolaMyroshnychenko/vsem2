package myr.vsem.laboratoryWork2;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class SugarPacked
 * @since 04.04.2021 - 12.42
 */
import myr.vsem.laboratoryWork2.IAccounting;

public class SugarPacked implements IAccounting{
    private String name; // sugar brand name
    private String type; // type of sugar
    private double weight;
    private double priceForPacked;
    private double priceForSugar;
    private int amount;

    public SugarPacked(String name, String type, double weight, double priceForPacked, double priceForSugar, int amount) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.priceForPacked = priceForPacked;
        this.priceForSugar = priceForSugar;
        this.amount = amount;
    }

    public SugarPacked() {
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

    public double getPriceForPacked() {
        return priceForPacked;
    }

    public void setPriceForPacked(double priceForPacked) {
        this.priceForPacked = priceForPacked;
    }

    public double getPriceForSugar() {
        return priceForSugar;
    }

    public void setPriceForSugar(double priceForSugar) {
        this.priceForSugar = priceForSugar;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "SugarPacked{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", priceForPacked=" + priceForPacked +
                ", priceForSugar=" + priceForSugar +
                ", amount=" + amount +
                '}';
    }

    @Override
    public double getUltimatePrice() {
        return (this.getPriceForPacked() + this.getPriceForSugar() * this.weight) * amount;
    }
}
