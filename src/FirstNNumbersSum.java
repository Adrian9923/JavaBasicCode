import java.util.Scanner;

public class FirstNNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
            if (i < n)
                System.out.printf("%d+",i);
            else
                System.out.printf("%d",i);

        }
        System.out.printf("=%d",sum);

    }
}
