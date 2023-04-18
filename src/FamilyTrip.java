package Exam;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        int numNights = scanner.nextInt();
        double pricePerNight = scanner.nextDouble();
        int additionalCostPercentage = scanner.nextInt();
        double totalPrice = 0;

        double additionalCots = (additionalCostPercentage / 100.0) * budget;
        totalPrice += additionalCots;
        if (numNights >= 7){
            double discPrice = pricePerNight - (pricePerNight * 0.05);
            double pricePerNights = numNights * discPrice;
            totalPrice += pricePerNights;
        }else {
            double totalPriceNights = numNights * pricePerNight;
            totalPrice += totalPriceNights;
        }
        if (totalPrice <= budget){
            double moneyLeft = budget - totalPrice;
            System.out.printf("The Smiths will be left with %.2f dollars after the vacation.",moneyLeft);
        }else {
            double moneyNeed = totalPrice - budget;
            System.out.printf("%.2f dollars needed.",moneyNeed);
        }
    }
}
