import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());
        int sideC = Integer.parseInt(scanner.nextLine());
        if((sideA < sideB + sideC) && (sideB < sideA + sideC) && (sideC < sideA + sideB))
            System.out.print("Valid Triangle");
        else
            System.out.print("Invalid Triangle");

    }
}
