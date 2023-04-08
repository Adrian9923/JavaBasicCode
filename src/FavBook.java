package com.company;

import java.util.Scanner;

public class FavBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int attempts = 0;
        while (true) {
            String book = scanner.nextLine();
            if(book.equals(bookName)) {
                attempts++;
                break;
            }
            attempts++;
        }
        System.out.printf("Book found! Attempts: %d",attempts);
    }
}
