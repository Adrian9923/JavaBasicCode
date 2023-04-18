package Exam;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int gamesPlayed = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int wins = 0;
        int loss = 0;
        int draws = 0;
        for (int i = 1; i <= gamesPlayed; i++) {
            char result = scanner.nextLine().charAt(0);
            switch (result) {
                case 'W': {
                    totalPoints += 3;
                    wins++;
                    break;
                }
                case 'D': {
                    totalPoints += 1;
                    draws++;
                    break;
                }
                case 'L': {
                    totalPoints += 0;
                    loss++;
                    break;
                }
            }
        }
        if (gamesPlayed == 0){
            System.out.printf("%s hasn't played any games during this season.",name);
        }
        else {
            double winRate = (double) wins / gamesPlayed;
            System.out.printf("%s has won %d points during this season.\n",name,totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d\n",wins);
            System.out.printf("## D: %d\n",draws);
            System.out.printf("## L: %d\n",loss);
            System.out.printf("Win rate: %.2f%%",winRate * 100);
        }
    }
}
