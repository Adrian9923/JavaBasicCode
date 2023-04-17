package com.company;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        switch (cityName) {
            case "London": {
                if(sales < 0){
                    System.out.println("error");
                    break;
                }
                if(sales >= 0 && sales <= 500){
                    double commission = sales * 0.05;
                    System.out.printf("%.2f",commission);
                }else if(sales >= 501 && sales <= 1000){
                    double commission = sales * 0.07;
                    System.out.printf("%.2f",commission);
                }else if (sales >= 1001 && sales <= 10000){
                    double commission = sales * 0.08;
                    System.out.printf("%.2f",commission);
                }else if(sales > 10000){
                    double commission = sales * 0.12;
                    System.out.printf("%.2f",commission);
                }
                break;
            }
            case "New York": {
                if(sales < 0){
                    System.out.println("error");
                    break;
                }
                if(sales >= 0 && sales <= 500){
                    double commission = sales * 0.045;
                    System.out.printf("%.2f",commission);
                }else if(sales >= 501 && sales <= 1000){
                    double commission = sales * 0.075;
                    System.out.printf("%.2f",commission);
                }else if (sales >= 1001 && sales <= 10000){
                    double commission = sales * 0.1;
                    System.out.printf("%.2f",commission);
                }else if(sales > 10000){
                    double commission = sales * 0.13;
                    System.out.printf("%.2f",commission);
                }
                break;
            }
            case "Sydney": {
                if(sales < 0){
                    System.out.println("error");
                    break;
                }
                if(sales >= 0 && sales <= 500){
                    double commission = sales * 0.055;
                    System.out.printf("%.2f",commission);
                }else if(sales >= 501 && sales <= 1000){
                    double commission = sales * 0.08;
                    System.out.printf("%.2f",commission);
                }else if (sales >= 1001 && sales <= 10000){
                    double commission = sales * 0.12;
                    System.out.printf("%.2f",commission);
                }else if(sales > 10000){
                    double commission = sales * 0.145;
                    System.out.printf("%.2f",commission);
                }
                break;
            } default:
                System.out.println("error");

        }
    }
}
