import java.util.Scanner;

public class CheckForFoodOrDrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String check = scanner.nextLine();
        if(check.equals("curry") || check.equals("noodles") || check.equals("sushi") || check.equals("spaghetti"))
            System.out.print("food");
        else if(check.equals("tea") || check.equals("water") || check.equals("coffee"))
            System.out.print("drink");
        else
            System.out.print("unknown");

    }
}
