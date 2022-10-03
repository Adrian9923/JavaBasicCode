import java.util.Scanner;

public class MinAndMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int smallestNum = Integer.MAX_VALUE;
        int biggestNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if(num > biggestNum)
                biggestNum = num;
            if(num < smallestNum)
                smallestNum = num;
        }
        System.out.println("Min number: " + smallestNum);
        System.out.println("Max number: " + biggestNum);
    }
}
