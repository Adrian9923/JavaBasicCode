import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String check = scanner.nextLine();
        if(check.equals("banana") || check.equals("apple") || check.equals("kiwi") || check.equals("lemon") || check.equals("grapes") || check.equals("cherry"))
            System.out.print("fruit");
        else if(check.equals("cucumber") || check.equals("pepper") || check.equals("carrot"))
            System.out.print("vegetable");
        else
            System.out.print("unknown");

    }
}
