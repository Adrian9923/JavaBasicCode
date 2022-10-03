import java.util.Scanner;

public class FourOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble((scanner.nextLine()));
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        System.out.printf("%.2f + %.2f = %.2f \n",num1,num2,result1);
        System.out.printf("%.2f - %.2f = %.2f \n",num1,num2,result2);
        System.out.printf("%.2f * %.2f = %.2f \n",num1,num2,result3);
        System.out.printf("%.2f / %.2f = %.2f",num1,num2,result4);

    }
}
