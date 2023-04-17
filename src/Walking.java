package com.company;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int totalSteps = 0;
        int goal = 10000;
        while (!command.equals("Going home")){
            int steps = Integer.parseInt(command);
            totalSteps += steps;
            if(totalSteps >= goal) {
                System.out.println("Goal reached! Good job!");
                break;
            }
            command = scanner.nextLine();
        }
        int stepsHome = Integer.parseInt(scanner.nextLine());
        totalSteps += stepsHome;
        if (command.equals("Going home")){
            int stepsNeed = goal - totalSteps;
            System.out.printf("%d more steps to reach goal.",stepsNeed);
        }
    }
}
