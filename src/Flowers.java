package com.company;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lilias = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        int totalFlowers = lilias + roses + tulips;
        double priceBouquet = 0;

        switch (season){
            case "Spring":
            case "Summer":{
                if (holiday.equals("Y")){
                    double priceIncreaseLilia = lilias * (2 + (2 * 0.15));
                    double priceIncreaseRoses = roses * (4.10 + (4.10 * 0.15));
                    double priceIncreaseTulips = tulips * (2.50 + (2.50 * 0.15));
                    priceBouquet = priceIncreaseLilia + priceIncreaseRoses + priceIncreaseTulips;
                }else if(holiday.equals("N")){
                    double priceLilia = lilias * 2;
                    double priceRoses = roses * 4.10;
                    double priceTulips = tulips * 2.50;
                    priceBouquet = priceLilia + priceRoses + priceTulips;
                }

                if (tulips >= 7 && season.equals("Spring")){
                    priceBouquet = priceBouquet - (priceBouquet * 0.05);
                }
                if (totalFlowers > 20){
                    priceBouquet = priceBouquet - (priceBouquet * 0.2);
                }
                break;
            }
            case "Autumn":
            case "Winter":{
                if (holiday.equals("Y")){
                    double priceIncreaseLilia = lilias * (3.75 + (3.75 * 0.15));
                    double priceIncreaseRoses = roses * (4.50 + (4.50 * 0.15));
                    double priceIncreaseTulips = tulips * (4.15 + (4.15 * 0.15));
                    priceBouquet = priceIncreaseLilia + priceIncreaseRoses + priceIncreaseTulips;
                }else if(holiday.equals("N")){
                    double priceLilia = lilias * 3.75;
                    double priceRoses = roses * 4.50;
                    double priceTulips = tulips * 4.15;
                    priceBouquet = priceLilia + priceRoses + priceTulips;
                }

                if (roses >= 10 && season.equals("Winter")){
                    priceBouquet = priceBouquet - (priceBouquet * 0.1);
                }
                if (totalFlowers > 20){
                    priceBouquet = priceBouquet - (priceBouquet * 0.2);
                }
                break;
            }

        }
        double finalPrice = priceBouquet + 2;
        System.out.printf("%.2f",finalPrice);
    }
}
