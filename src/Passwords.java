package com.company;

import java.util.Scanner;

public class Passwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 2; i <= n; i+=2) {
            for (int j = 1; j <= n ; j+=2) {
                int result = i * j;
                System.out.printf("%d%d%d ",i,j,result);
            }
        }
    }
}
