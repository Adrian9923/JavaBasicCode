import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        if(operator.equals("+")) {
            result += num1 + num2;
            System.out.printf("%d + %d = %.2f",num1,num2,result);
        }
        if(operator.equals("-")) {
            result += num1 - num2;
            System.out.printf("%d - %d = %.2f",num1,num2,result);
        }
        if(operator.equals("*")) {
            result += num1 * num2;
            System.out.printf("%d * %d = %.2f",num1,num2,result);
        }
        if(operator.equals("/")) {
            result += (double) num1 / num2;
            System.out.printf("%d / %d = %.2f",num1,num2,result);
        }
        if(operator.equals("%")) {
            result += num1 % num2;
            System.out.printf("%d %% %d = %.2f",num1,num2,result);
        }

    }
}
