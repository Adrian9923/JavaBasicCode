import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String extra = scanner.nextLine();
        if(drink.equals("coffee") && extra.equals("sugar"))
            System.out.print("Final price: $1.40");
        else if(drink.equals("coffee") && extra.equals("no"))
            System.out.print("Final price: $1.00");
        else if(drink.equals("tea") && extra.equals("sugar"))
            System.out.print("Final price: $1.00");
        else if(drink.equals("tea") && extra.equals("no"))
            System.out.print("Final price: $0.60");

    }
}
