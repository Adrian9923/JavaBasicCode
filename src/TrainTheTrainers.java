package com.company;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJury = Integer.parseInt(scanner.nextLine());
        String topic = scanner.nextLine();
        double avgTopic = 0;
        double sum = 0;
        double totalSum = 0;
        int numGrades = 0;
        while (!topic.equals("Finish")){
            for (int i = 1; i <= numJury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sum += grade;
                totalSum += grade;
                numGrades++;
            }
            avgTopic = sum / numJury;
            System.out.printf("%s - %.2f.\n",topic,avgTopic);
            sum = 0;
            avgTopic = 0;
            topic = scanner.nextLine();

        }
        double avgGrade = totalSum / numGrades;
        System.out.printf("Student's final assessment is %.2f.",avgGrade);

    }
}
