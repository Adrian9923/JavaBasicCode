package Exam;

import java.util.Scanner;

public class TournamentForChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dayWin = 0;
        int dayLose = 0;
        double allProfit = 0;
        for (int i = 1; i <= days; i++) {
            int countWinGames = 0;
            int countLoseGames = 0;
            double dayProfit = 0;
            while (true){
                String command = scanner.nextLine();
                if (command.equals("Finish")){
                    break;
                }
                String result = scanner.nextLine();
                if (result.equals("win")){
                    countWinGames++;
                    dayProfit += 20;
                }else if (result.equals("lose")){
                    countLoseGames++;
                }
            }
            if (countWinGames > countLoseGames)
            {
                dayProfit *= 1.1;
                dayWin++;
            }
            else {
                dayLose++;
            }
            allProfit += dayProfit;
        }
        if (dayWin > dayLose)
        {
            allProfit *= 1.2;
            System.out.printf("You won the tournament! Total money raised: %.2f",allProfit);
        }else
            System.out.printf("You lost the tournament! Total money raised: %.2f",allProfit);
    }
}
