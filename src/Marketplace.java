import java.util.Scanner;

public class Marketplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();

        if(product.equals("Banana") && day.equals("Weekday"))
            System.out.print("2.50");
        else if(product.equals("Banana") && day.equals("Weekend"))
            System.out.print("2.70");
        else if(product.equals("Apple") && day.equals("Weekday"))
            System.out.print("1.30");
        else if(product.equals("Apple") && day.equals("Weekend"))
            System.out.print("1.60");
        else if(product.equals("Kiwi") && day.equals("Weekday"))
            System.out.print("2.20");
        else if(product.equals("Kiwi") && day.equals("Weekend"))
            System.out.print("3.00");

    }
}
