import java.util.Scanner;

public class ZigZagSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if(i % 2 == 0)
                result += num;
            else
                result -= num;
        }
        System.out.println(result);
    }
}
