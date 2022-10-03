import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();
        for (int num = startNum; num <= endNum; num++) {
            boolean isPrime = true;
            for (int divider = 2; divider <= Math.sqrt(num) ; divider++) {
                if(num % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(num + " ");
        }
    }
}
