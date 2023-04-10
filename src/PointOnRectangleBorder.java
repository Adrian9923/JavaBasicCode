package com.company;

import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if(((x == x1 || x == x2) && (y >= y1 && y <= y2)) || ((y == y1 || y == y2) && (x >= x1 && x <= x2)))
            System.out.println("Border");
        else
            System.out.println("Inside/Outside");
    }
}
