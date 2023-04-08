package com.company;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double sum = 0.0;


        switch (season) {
            case "Spring":
                price = 3000.0;
                break;
            case "Summer":
                price = 4200.0;
                break;
            case "Autumn":
                price = 4200.0;
                break;
            case "Winter":
                price = 2600.0;
                break;
        }

        if (people <= 6) {
            sum = price - (0.1 * price);
        } else if (people > 7 && people <= 11) {
            sum = price - (0.15 * price);
        } else if (people > 12) {
            sum = price - (0.25 * price);
        }


        if (people % 2 == 0 && !(season.equals("Autumn"))){
            sum = sum * 0.95;}
        double result = budget - sum;
        if (result >= 0) {
            System.out.printf("Yes! You have %.2f dollars left.", result);
        } else {
            System.out.printf("Not enough money! You need %.2f dollars.", -result);
        }
    }
}
