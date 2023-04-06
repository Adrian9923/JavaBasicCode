package com.company;

import java.util.Scanner;

public class DishWasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBottles = Integer.parseInt(scanner.nextLine());
        int totalDetergentQuantity = 750 * numBottles;
        int dishLoadTimes = 0;
        int totalPlates = 0;
        int totalPots = 0;
        int totalQuantityDetergentUsed = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")){
            int numVessels = Integer.parseInt(command);
            dishLoadTimes++;
            if(dishLoadTimes % 3 == 0){
                totalPots += numVessels;
                totalQuantityDetergentUsed += numVessels * 15;
            }else {
                totalPlates += numVessels;
                totalQuantityDetergentUsed += numVessels * 5;
            }
            if(totalQuantityDetergentUsed > totalDetergentQuantity){
                int detergentNeed = totalQuantityDetergentUsed - totalDetergentQuantity;
                System.out.printf("Not enough detergent, %d ml. more necessary!",detergentNeed);
                break;
            }
            command = scanner.nextLine();
        }
        if (totalQuantityDetergentUsed <= totalDetergentQuantity){
            int detergentLeft = totalDetergentQuantity - totalQuantityDetergentUsed;
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n",totalPlates,totalPots);
            System.out.printf("Leftover detergent %d ml.",detergentLeft);
        }
    }
}
