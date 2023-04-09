package com.company;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeVineyard = scanner.nextInt();
        double yieldPerSquare = scanner.nextDouble();
        int totalProduction = scanner.nextInt();
        int numWorkers = scanner.nextInt();

        double totalYield = sizeVineyard * yieldPerSquare;
        double totalWineProduced = (totalYield * 0.4) / 2.5;
        if(totalWineProduced >= totalProduction) {
            double litersRemained = Math.ceil(totalWineProduced - totalProduction);
            double litersPerWorker = Math.ceil(litersRemained / numWorkers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n",totalWineProduced);
            System.out.printf("%.0f liters left -> %.0f liters per person.",litersRemained, litersPerWorker);
        }else if(totalProduction > totalWineProduced){
            double litersNeeded = Math.floor(totalProduction - totalWineProduced);
            System.out.printf("It will be a tough winter! %.0f liters of wine needed to reach the goal.",litersNeeded);
        }
    }
}
