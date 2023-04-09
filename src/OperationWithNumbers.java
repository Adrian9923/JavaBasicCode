package com.company;

import java.util.Scanner;

public class OperationWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        switch (operator) {
            case '+': {
                int result = num1 + num2;
                System.out.printf("%d %c %d = %d",num1,operator,num2,result);
                break;
            }
            case '-': {
                int result = num1 - num2;
                System.out.printf("%d %c %d = %d",num1,operator,num2,result);
                break;
            }
            case '/': {
                int result = num1 / num2;
                System.out.printf("%d %c %d = %d",num1,operator,num2,result);
                break;
            }
            case '%': {
                int result = num1 % num2;
                System.out.printf("%d %c %d = %d",num1,operator,num2,result);
                break;
            }
            case '*': {
                int result = num1 * num2;
                System.out.printf("%d %c %d = %d",num1,operator,num2,result);
                break;
            }
        }
    }
}
