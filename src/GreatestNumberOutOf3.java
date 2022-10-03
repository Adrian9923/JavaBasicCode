import java.util.Scanner;

public class GreatestNumberOutOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1 >= num2 && num1 >= num3)
            System.out.print(num1);
        else if(num2 >= num1 && num2 >= num3)
            System.out.print(num2);
        else
            System.out.print(num3);

    }
}
