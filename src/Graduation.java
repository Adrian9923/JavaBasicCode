package com.company;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int countGrades = 12;
        double avgGrade;
        double sumOfGrades = 0;
        while (countGrades > 0){
            double grade = Double.parseDouble(scanner.nextLine());
            sumOfGrades += grade;
            countGrades--;
        }
        avgGrade = sumOfGrades / 12;
        if (avgGrade >= 4)
            System.out.printf("%s graduated. Average grade: %.2f",name,avgGrade);
        else
            System.out.printf("%s has to repeat the class",name);
    }
}
