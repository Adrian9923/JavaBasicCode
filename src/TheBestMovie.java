package com.company;

import java.util.Scanner;

public class TheBestMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxSum = Integer.MIN_VALUE;
        int movieCounter = 0;
        String bestMovie = "";

        while (!command.equals("STOP")){

            int currentSum = 0;
            movieCounter++;
            for (int i = 0; i < command.length(); i++) {
                int currentChar = command.charAt(i);
                currentSum += currentChar;
                if (currentChar >= 65 && currentChar <= 90){
                    currentSum -= command.length();
                }else if (currentChar >= 97 && currentChar <= 122){
                    currentSum -= command.length() * 2;
                }
            }

            if (currentSum > maxSum){
                maxSum = currentSum;
                bestMovie = command;
            }
            if (movieCounter >= 7) {
                System.out.println("The limit is reached.");
                break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.",bestMovie,maxSum);
    }
}
