package com.company;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                for (int k = 0; k <= num; k++) {
                    for (int l = 0; l <= num; l++) {
                        for (int m = 0; m <= num; m++) {
                            if (i+j+k+l+m == num)
                                count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
