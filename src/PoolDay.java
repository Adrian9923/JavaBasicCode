package Exam;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = scanner.nextInt();
        double entranceFeePerPeople = scanner.nextDouble();
        double priceSunbed = scanner.nextDouble();
        double priceUmbrella = scanner.nextDouble();
        double priceSunbeds;
        double priceUmbrellas;
        double totalPrice = 0;
        double totalEntranceFee = entranceFeePerPeople * numPeople;

        double peopleWithSunbeds = Math.ceil(numPeople * 0.75);
        double peopleWithUmbrellas = Math.ceil(numPeople / 2.0);

        priceSunbeds = priceSunbed * peopleWithSunbeds;
        priceUmbrellas = priceUmbrella * peopleWithUmbrellas;
        totalPrice += totalEntranceFee + priceSunbeds + priceUmbrellas;
        System.out.printf("%.2f euro",totalPrice);
    }
}
