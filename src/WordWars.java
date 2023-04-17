package com.company;

import java.util.Scanner;

public class WordWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int prevSum = 0;
        String winner = "";
        while (!command.equals("STOP")) {
            while (start < command.length()) {
                int x = command.charAt(start);
                sum += x;
                start++;
            }
            prevSum += sum;
            if (prevSum > max) {
                max = prevSum;
                winner = command;
            }
            command = scanner.nextLine();
            sum = 0;
            start = 0;
            prevSum = 0;
        }
        System.out.printf("Winner is %s - %d!",winner,max);
    }
}
