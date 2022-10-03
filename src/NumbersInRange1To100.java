import java.util.Scanner;

public class NumbersInRange1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n < 1 || n > 100)
            n =scanner.nextInt();

        System.out.println(n);
    }
}
