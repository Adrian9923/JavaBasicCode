import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxDiff = 0;
        int prevSum = 0;
        for (int i = 0; i < n; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            if(i > 0) {
                int diff = Math.abs(prevSum - sum);
                if (diff > maxDiff)
                    maxDiff = diff;
            }
            prevSum = sum;
        }
        if(maxDiff == 0)
            System.out.println("Yes, value=" + prevSum);
        else
            System.out.println("No, maxdiff=" + maxDiff);
    }
}
