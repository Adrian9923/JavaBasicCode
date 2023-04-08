package com.company;

import java.util.Scanner;

public class Gardeening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMeters = scanner.nextDouble();
        double totalPrice = squareMeters * 7.61;
        double finalPrice = totalPrice - (totalPrice * 0.18);
        double discount = totalPrice - finalPrice;
        System.out.printf("The final price is: %.2f dollars\n",finalPrice);
        System.out.printf("The discount is: %.2f dollars",discount);
    }


}
