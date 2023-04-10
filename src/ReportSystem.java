package com.company;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int count = 0;
        double totalCash = 0;
        double totalCard = 0;
        double totalCollected = 0;
        int cashPayments = 0;
        int cardPayments = 0;
        while (!command.equals("End")){
            int priceItem = Integer.parseInt(command);
            count++;
            if (count % 2 == 0){
                if (priceItem < 10){
                    System.out.println("Error in transaction!");
                }else {
                    totalCard += priceItem;
                    totalCollected += totalCard;
                    System.out.println("Product sold!");
                    cardPayments++;
                }
            }else {
                if (priceItem > 100){
                    System.out.println("Error in transaction!");
                }else {
                    totalCash += priceItem;
                    totalCollected += totalCash;
                    System.out.println("Product sold");
                    cashPayments++;
                }
            }
            if (totalCollected >= target){
                double avgCash = totalCash / cashPayments;
                double avgCard = totalCard / cardPayments;
                System.out.printf("Average CS: %.2f\n",avgCash);
                System.out.printf("Average CC: %.2f",avgCard);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("End")) {
            System.out.println("Failed to collect required money for charity");
        }
    }
}
