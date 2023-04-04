package com.company;

import java.util.Scanner;

public class BaseAndExponent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= p; i++) {
            result *= n;
        }
        System.out.println(result);
    }
}
