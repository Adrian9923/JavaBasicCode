package com.company;

import java.util.Scanner;

public class CalculatorForTvSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodeDuration = Double.parseDouble(scanner.nextLine());

        double totalAdvPerEp = (episodeDuration *1.2) - episodeDuration;
        double totalAdvDur = (totalAdvPerEp * episodes) * seasons;
        double totalTimeWithoutAds = (episodeDuration * episodes) * seasons;
        double totalDuration = totalAdvDur + totalTimeWithoutAds;

        double specialEpisode = seasons * 10;
        double totalTimeNeeded = totalDuration + specialEpisode;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",title,totalTimeNeeded);
    }
}
