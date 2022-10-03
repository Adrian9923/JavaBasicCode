import java.util.Scanner;

public class DaysToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int result = 60 * days * 24;
        System.out.printf("%d", result);

    }
}
