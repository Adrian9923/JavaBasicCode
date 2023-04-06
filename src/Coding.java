package com.company;

import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int counter = command.length();
        int prevDigit = 0;
        int currentDigit = 33;
        int num = Integer.parseInt(command);
        while (counter > 0){
            int lastDigit = num % 10;
            prevDigit += lastDigit;
            currentDigit += prevDigit;
            if (lastDigit == 0){
                System.out.print("ZERO");
            }else {
                for (int i = 1; i <= prevDigit; i++) {
                    char x = (char) currentDigit;
                    System.out.print(x);
                }
            }
            currentDigit = 33;
            prevDigit = 0;
            num /= 10;
            counter--;
            System.out.println();
        }
    }
}
