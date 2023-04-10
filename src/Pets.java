package com.company;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfDays = scanner.nextInt();
        int leftFoodKg = scanner.nextInt();
        double foodDogPerDayKg = scanner.nextDouble();
        double foodCatPerDayKg = scanner.nextDouble();
        double foodTurtlePerDayKg = scanner.nextDouble();

        double totalDogFood = numOfDays * foodDogPerDayKg;
        double totalCatFood = numOfDays * foodCatPerDayKg;
        double totalTurtleFood = numOfDays * (foodTurtlePerDayKg / 1000);

        double totalFood = totalDogFood + totalCatFood + totalTurtleFood;
        if(leftFoodKg >= totalFood){
            double result = Math.floor(leftFoodKg - totalFood);
            System.out.printf("%.0f kilos of food left.",result);
        }else{
            double result = Math.ceil(totalFood - leftFoodKg);
            System.out.printf("%.0f more kilos of food are needed.",result);
        }
    }
}
