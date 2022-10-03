import java.util.Scanner;

public class SumOfDigitsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumDigits = 0;
        while (true){
            String nextLine = scanner.nextLine();
            if(nextLine.equals("End"))
                break;
            int num = Integer.parseInt(nextLine);
            while (num > 0) {
                int lastDigit = num % 10;
                sumDigits += lastDigit;
                num = num / 10;
            }
            System.out.println("Sum of digits: " + sumDigits);
            sumDigits = 0;
        }
        System.out.println("Goodbye");
    }
}
