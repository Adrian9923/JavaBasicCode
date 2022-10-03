import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int biggestNum = -999999;
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            if (num > biggestNum)
                biggestNum = (int)num;
        }
        System.out.println(biggestNum);
    }
}
