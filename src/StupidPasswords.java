import java.util.Scanner;

public class StupidPasswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int firstDig = 2; firstDig <= n; firstDig+=2) {
            for (int secondDig = 1; secondDig <= n; secondDig+=2) {
                int mult = firstDig * secondDig;
                System.out.print("" + firstDig + secondDig + mult + " ");
            }
        }

    }
}
