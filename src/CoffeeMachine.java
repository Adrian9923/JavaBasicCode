package Exam;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeDrink = scanner.nextLine();
        String sugarLevel = scanner.nextLine();
        int numDrinks = Integer.parseInt(scanner.nextLine());
        double totalBill = 0;
        switch (typeDrink) {
            case "Espresso": {
                if (sugarLevel.equals("Without")){
                    double disc = 0.90 - (0.90 * 0.35);
                    totalBill += disc * numDrinks;
                }else if (sugarLevel.equals("Normal")){
                    totalBill += numDrinks;
                }else if (sugarLevel.equals("Extra sugar")){
                    totalBill += 1.20 * numDrinks;
                }if (numDrinks >= 5){
                    totalBill *= 0.75;
                }
                if (totalBill > 15){
                    totalBill *= 0.8;
                }
                break;
            }
            case "Cappuccino": {
                if (sugarLevel.equals("Without")){
                    double disc = 1 - (1 * 0.35);
                    totalBill += disc * numDrinks;
                }else if (sugarLevel.equals("Normal")){
                    totalBill += 1.20 * numDrinks;
                }else if (sugarLevel.equals("Extra sugar")){
                    totalBill += 1.60 * numDrinks;
                }
                if (totalBill > 15){
                    totalBill *= 0.8;
                }
                break;
            }
            case "Tea": {
                if (sugarLevel.equals("Without")){
                    double disc = 0.50 - (0.50 * 0.35);
                    totalBill += disc * numDrinks;
                }else if (sugarLevel.equals("Normal")){
                    totalBill += 0.60 * numDrinks;
                }else if (sugarLevel.equals("Extra sugar")){
                    totalBill += 0.70 * numDrinks;
                }
                if (totalBill > 15){
                    totalBill *= 0.8;
                }
                break;
            }
        }
        System.out.printf("You bought %d cups of %s for %.2f dollars.",numDrinks,typeDrink,totalBill);
    }
}
