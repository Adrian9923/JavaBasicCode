package com.company;

import java.util.Scanner;

public class TimeForLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        int durEp = Integer.parseInt(scanner.nextLine());
        int durBreak = Integer.parseInt(scanner.nextLine());
        double lunchTime = durBreak / 8.0;
        double relaxTime = durBreak / 4.0;
        double spentTime = lunchTime + relaxTime;
        double watchTime = durBreak - spentTime;
        if (watchTime >= durEp){
            double timeLeft = Math.ceil(watchTime - durEp);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",title,timeLeft);
        }else {
            double timeNeeded = Math.ceil(durEp - watchTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",title,timeNeeded);
        }


    }
}
