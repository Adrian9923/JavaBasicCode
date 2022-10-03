import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        double result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        System.out.println(result);
    }
}
