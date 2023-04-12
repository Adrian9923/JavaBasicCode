package com.company;

import java.util.Scanner;

public class TimeAfter15Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        minutes += 15;
        if(minutes >= 60){
            minutes -= 60;
            hours++;
        }
        if(hours >= 24){
            hours -= 24;
        }

        System.out.printf("%d:%02d\n",hours,minutes);
    }
}
