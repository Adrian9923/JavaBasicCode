package com.company;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = scanner.nextDouble();
        int year = scanner.nextInt();
        double moneySpent = 0;
        int age = 18;
        for (int i = 1800; i <= year; i++) {
            if(i % 2 == 0){
                moneySpent += 12000;
            }else {
                moneySpent += 12000 + 50 * age;
            }
            age++;
        }
        if (inheritedMoney >= moneySpent){
            double moneyLeft = inheritedMoney - moneySpent;
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",moneyLeft);
        }else {
            double moneyNeed = moneySpent - inheritedMoney;
            System.out.printf("He will need %.2f dollars to survive.",moneyNeed);
        }
    }
}
