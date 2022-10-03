import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 0)
            n = -n;
        int sum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
