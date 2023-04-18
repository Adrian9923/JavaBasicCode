package Exam;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double goal = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double income = 0;
        while (!command.equals("Party!")){
            int count = Integer.parseInt(scanner.nextLine());
            double price = command.length();
            if (price % 2 != 0){
                price *= 0.75;
            }
            income += price * count;
            if (income >= goal){
                System.out.println("Target acquired.");
                break;
            }

            command = scanner.nextLine();
        }
        if (command.equals("Party!")){
            double moneyNeed = goal - income;
            System.out.printf("We need %.2f dollars more.\n",moneyNeed);
        }
        System.out.printf("Club income - %.2f dollars.",income);
    }
}
