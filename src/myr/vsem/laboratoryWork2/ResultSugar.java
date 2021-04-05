package myr.vsem.laboratoryWork2;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class ResultSugar
 * @since 04.04.2021 - 13.31
 */

import myr.vsem.laboratoryWork2.IAccounting;
import myr.vsem.laboratoryWork2.SugarPacked;
import myr.vsem.laboratoryWork2.SugarWeight;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultSugar {
    public static void main(String[] args) {

        List<IAccounting> list = new ArrayList<>(
                Arrays.asList(
                        new SugarPacked("Sun Sugar", "Cane Sugar", 0.5, 0.3, 272.6, 4),
                        new SugarPacked("Solodko", "Beet Sugar", 10, 4, 28.1, 1),
                        new SugarPacked("Monterico", "Palm Sugar", 1, 0.6, 424, 3),
                        new SugarPacked("Best Sugar", "Beet Sugar", 5, 2.5, 25.8, 5),
                        new SugarPacked("Sun Sugar", "Cane Sugar", 1.5, 0.5, 208, 2),
                        new SugarWeight("Sakharok", "Cane Sugar", 0.75, 232.2),
                        new SugarWeight("Monterico", "Beet Sugar", 5, 32),
                        new SugarWeight("Sakharok", "Beet Sugar", 7, 33.5),
                        new SugarWeight("Solodko", "Cane Sugar", 0.3, 258),
                        new SugarWeight("Prime S", "Palm Sugar", 1.5, 402.9)
                )
        );
        double totalIncome = list.stream().mapToDouble(IAccounting::getUltimatePrice).sum();
        System.out.println("Total sugar income = " + totalIncome + " ₴");
        double expensive = list.stream().mapToDouble(IAccounting::getUltimatePrice).max().getAsDouble();
        System.out.println("The most expensive sugar = " + expensive + " ₴");
        double cheap = list.stream().mapToDouble(IAccounting::getUltimatePrice).min().getAsDouble();
        System.out.println("The cheapest sugar = " + cheap + " ₴");
        double average = list.stream().mapToDouble(IAccounting::getUltimatePrice).average().getAsDouble();
        System.out.println("The average price for sugar = " + average + " ₴");
        double totalSumPacked = list.stream()
                .filter(el -> el instanceof SugarPacked)
                .mapToDouble(IAccounting::getUltimatePrice).sum();
        double totalSumWeight = list.stream()
                .filter(el -> el instanceof SugarWeight)
                .mapToDouble(IAccounting::getUltimatePrice).sum();
        if (totalSumPacked > totalSumWeight){
            System.out.println("More sugar is sold in a packed");}
        else {
            System.out.println("More sugar is sold by weight");
        }
    }
}

/*
Results:
Total sugar income = 4638.1 ₴
The most expensive sugar = 1273.8000000000002 ₴
The cheapest sugar = 77.39999999999999 ₴
The average price for sugar = 463.81000000000006 ₴
More sugar is sold in a packed
 */