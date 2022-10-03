import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n % 2 == 0)
            n = scanner.nextInt();

        System.out.println(n);
    }
}
