package com.company;

import java.util.Scanner;

public class CinemaIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int totalPeople = 0;
        int ticketPrice = 5;
        int totalIncome = 0;
        while (!command.equals("Movie time!")){
            int people = Integer.parseInt(command);
            totalIncome += people * ticketPrice;
            if (people % 3 == 0){
                totalIncome -= 5;
            }
            totalPeople += people;
            if (totalPeople > capacity){
                System.out.println("The cinema is full.");
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Movie time!")){
            int seatsLeft = capacity - totalPeople;
            System.out.printf("There are %d seats left in the cinema.\n",seatsLeft);
        }
        System.out.printf("Cinema income - %d$",totalIncome);
    }
}
