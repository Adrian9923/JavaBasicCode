import java.util.Scanner;

public class ProductOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        if((num1 * num2 * num3) < 0)
            System.out.print("negative");
        else if((num1 * num2 * num3) == 0)
            System.out.print("zero");
        else
            System.out.print("positive");

    }
}
