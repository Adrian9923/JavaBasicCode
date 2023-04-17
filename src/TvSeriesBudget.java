package com.company;

import java.util.Scanner;

public class TvSeriesBudget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numSeries = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numSeries; i++) {
            String title = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            if (title.equals("Thrones"))
                price *= 0.5;
            else if (title.equals("Lucifer"))
                price *= 0.6;
            else if (title.equals("Protector"))
                price *= 0.7;
            else if (title.equals("TotalDrama"))
                price *= 0.8;
            else if (title.equals("Area"))
                price *= 0.9;

            budget -= price;
        }
        if (budget >= 0){
            System.out.printf("You bought all the series and left with %.2f$",budget);
        }else {
            System.out.printf("You need %.2f$ more to buy the series!",Math.abs(budget));
        }
    }
}
