package com.company;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String print = "";
        String output = "";
        int c = 0;
        int o = 0;
        int n = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")){
            char x = command.charAt(0);
            if ((((x >= 'a' || x <= 'z') ||(x >= 'A' || x <= 'Z')) && Character.isAlphabetic(x))){
                if ((x == 'c' || x == 'o' || x == 'n') && (c == 0 || o == 0 || n == 0)) {
                    switch (x) {
                        case 'c': {
                            if (c == 1) {
                                output += x;
                                break;
                            } else {
                                c++;
                            }
                            break;
                        }
                        case 'o' : {
                            if (o == 1){
                                output += x;
                                break;
                            }else {
                                o++;
                            }
                            break;
                        }
                        case 'n': {
                            if (n == 1){
                                output += x;
                                break;
                            }else {
                                n++;
                            }
                            break;
                        }
                    }
                }else {
                    output += x;
                }
                if ((x == 'c' || x == 'o' || x == 'n') && (c == 1 && o == 1 && n == 1)){
                    output += " ";
                    print += output;
                    c = 0;
                    o = 0;
                    n = 0;
                    output = "";
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(print);
    }
}
