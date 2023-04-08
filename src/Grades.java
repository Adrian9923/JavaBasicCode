package com.company;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = scanner.nextInt();
        int topStudents = 0;
        int between4And5 = 0;
        int between3and4 = 0;
        int fail = 0;
        double grades = 0;
        for (int i = 0; i < students; i++) {
            double grade = scanner.nextDouble();
            if(grade >= 5) {
                topStudents++;
                grades += grade;
            }
            if(grade >= 4 && grade < 5) {
                between4And5++;
                grades += grade;
            }
            if(grade >= 3 && grade < 4) {
                between3and4++;
                grades += grade;
            }
            if(grade < 3) {
                fail++;
                grades += grade;
            }
        }
        double averageGrade = grades / students;
        double percentageTopStudents = 100 * (double) topStudents / students;
        double percentageBetween4And5 = 100 * (double) between4And5 / students;
        double percentageBetween3And4 = 100 * (double) between3and4 / students;
        double percentageFail = 100 * (double) fail / students;
        System.out.printf("Top students: %.2f%%\n",percentageTopStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",percentageBetween4And5);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",percentageBetween3And4);
        System.out.printf("Fail: %.2f%%\n",percentageFail);
        System.out.printf("Average: %.2f",averageGrade);
    }
}
