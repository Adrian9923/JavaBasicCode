package com.company;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volumeWater = scanner.nextInt();
        int firstPipe = scanner.nextInt();
        int secondPipe = scanner.nextInt();
        double hoursPipeOpened = scanner.nextDouble();

        double capacityFirstPipe = firstPipe * hoursPipeOpened;
        double capacitySecondPipe = secondPipe * hoursPipeOpened;

        double totalCapacity = capacityFirstPipe + capacitySecondPipe;
        double filledUp = (totalCapacity / volumeWater) * 100;

        double firstPipeFilled = (capacityFirstPipe / totalCapacity) * 100;
        double secondPipeFilled = (capacitySecondPipe / totalCapacity) * 100;

        if(totalCapacity <= volumeWater)
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",filledUp,firstPipeFilled,secondPipeFilled);
        else {
            double overflow = totalCapacity - volumeWater;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hoursPipeOpened, overflow);
        }
    }
}
