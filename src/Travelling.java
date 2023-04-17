package com.company;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        int requiredBudget = Integer.parseInt(scanner.nextLine());
        int totalAmount = 0;
        while (true){
            int money = Integer.parseInt(scanner.nextLine());
            totalAmount += money;
            if (totalAmount >= requiredBudget){
                System.out.printf("Going to %s!\n",destination);
                totalAmount = 0;
                destination = scanner.nextLine();
                if (destination.equals("End"))
                    break;
                requiredBudget = Integer.parseInt(scanner.nextLine());
            }
        }
    }
}
