package com.company;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        int booksLibrary = Integer.parseInt(scanner.nextLine());
        int countBooks = 0;
        boolean isFound = false;
        while (booksLibrary > countBooks) {
            String annaBook = scanner.nextLine();
            if(annaBook.equals(searchedBook)){
                isFound = true;
                break;
            }
            countBooks++;
        }
        if (isFound){
            System.out.printf("You checked %d books and found it.",countBooks);
        }
        else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",countBooks);
        }
    }
}
