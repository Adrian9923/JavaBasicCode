package com.company;

import java.util.Scanner;

public class VacationExpanses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String type = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        switch (season) {
            case "Spring": {
                if (type.equals("Hotel")){
                    double totalExpanses = days * 30;
                    totalExpanses = totalExpanses - (totalExpanses * 0.2);
                    System.out.printf("%.2f",totalExpanses);
                }else if (type.equals("Camping")){
                    double totalExpanses = days * 10;
                    totalExpanses = totalExpanses - (totalExpanses * 0.2);
                    System.out.printf("%.2f",totalExpanses);
                }
                break;
            }
            case "Summer": {
                if (type.equals("Hotel")){
                    double totalExpanses = days * 50;
                    System.out.printf("%.2f",totalExpanses);
                }else if (type.equals("Camping")){
                    double totalExpanses = days * 30;
                    System.out.printf("%.2f",totalExpanses);
                }
                break;
            }
            case "Autumn": {
                if (type.equals("Hotel")){
                    double totalExpanses = days * 20;
                    totalExpanses = totalExpanses - (totalExpanses * 0.3);
                    System.out.printf("%.2f",totalExpanses);
                }else if (type.equals("Camping")){
                    double totalExpanses = days * 15;
                    totalExpanses = totalExpanses - (totalExpanses * 0.3);
                    System.out.printf("%.2f",totalExpanses);
                }
                break;
            }
            case "Winter": {
                if (type.equals("Hotel")){
                    double totalExpanses = days * 40;
                    totalExpanses = totalExpanses - (totalExpanses * 0.1);
                    System.out.printf("%.2f",totalExpanses);
                }else if (type.equals("Camping")){
                    double totalExpanses = days * 10;
                    totalExpanses = totalExpanses - (totalExpanses * 0.1);
                    System.out.printf("%.2f",totalExpanses);
                }
                break;
            }
        }

    }
}
