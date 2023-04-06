package com.company;

import java.util.Scanner;

public class ClockPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        for (int i = hours; i <= 23; i++) {
            for (int j = minutes; j <= 59; j++) {
                if (j == 59){
                    minutes = 0;
                }
                for (int k = seconds; k <= 59; k++) {
                    if (k == 59){
                        seconds = 0;
                    }
                    System.out.printf("%02d:%02d:%02d\n",i,j,k);
                }
            }
        }


    }
}
