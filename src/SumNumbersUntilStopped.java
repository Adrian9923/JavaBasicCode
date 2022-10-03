import java.util.Scanner;

public class SumNumbersUntilStopped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for ( ; ; ){
            int num = scanner.nextInt();
            if (num != 0) {
                sum += num;
                System.out.printf("Sum = %d\n", sum);
            }
            else {
                System.out.println("Good bye");
                return;
            }
        }

    }
}
