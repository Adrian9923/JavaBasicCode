import java.util.Scanner;

public class SortedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        if(num1 < num2 && num1 < num3)
            System.out.print("Ascending");
        else if(num3 < num1 && num3 < num2)
            System.out.print("Descending");
        else
            System.out.print("Not sorted");

    }
}
