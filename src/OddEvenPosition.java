package com.company;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double oddMax = Double.NEGATIVE_INFINITY;
        double oddMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;
        double evenMin = Double.POSITIVE_INFINITY;
        double oddSum = 0;
        double evenSum = 0;
        for (int i = 1; i <= n; i++) {
            double number = scanner.nextDouble();
            if (i % 2 == 0){
                evenSum += number;
                if (number > evenMax)
                    evenMax = number;
                if(number < evenMin)
                    evenMin = number;
            }else {
                oddSum += number;
                if(number > oddMax)
                    oddMax = number;
                if(number < oddMin)
                    oddMin = number;
            }
        }
        if(n == 0) {
            System.out.println("OddSum=0.00,");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.println("EvenSum=0.00,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
        else{
            System.out.printf("OddSum=%.2f,\n",oddSum);
            System.out.printf("OddMin=%.2f,\n",oddMin);
            System.out.printf("OddMax=%.2f,\n",oddMax);
            System.out.printf("EvenSum=%.2f,\n",evenSum);
            System.out.printf("EvenMin=%.2f,\n",evenMin);
            System.out.printf("EvenMax=%.2f",evenMax);
        }
    }
}
