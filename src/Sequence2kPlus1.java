import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num = (num * 2) + 1;
        }
    }
}
