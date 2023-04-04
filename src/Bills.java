package com.company;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = scanner.nextInt();
        double totalCostElectricity = 0;
        double costWater = 20;
        double costInternet = 15;
        double totalCostWater = 0;
        double totalCostInternet = 0;
        double totalCostOthers = 0;
        for (int i = 0; i < months; i++) {
            double costElectricity = scanner.nextDouble();
            totalCostElectricity += costElectricity;
            totalCostWater = months * costWater;
            totalCostInternet = months * 15;
            totalCostOthers += (costElectricity + costWater + costInternet) * 1.2;
        }
        double average = (totalCostElectricity + totalCostWater + totalCostInternet + totalCostOthers)/months;
        System.out.printf("Electricity: $%.2f\n",totalCostElectricity);
        System.out.printf("Water: $%.2f\n",totalCostWater);
        System.out.printf("Internet: $%.2f\n",totalCostInternet);
        System.out.printf("Other: $%.2f\n",totalCostOthers);
        System.out.printf("Average: $%.2f",average);
    }
}
