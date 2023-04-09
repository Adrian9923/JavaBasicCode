package com.company;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;
        for (int i = 1; i <= days; i++) {
            int numPatients = scanner.nextInt();
            if(i % 3 == 0 && untreatedPatients > treatedPatients)
                doctors ++;
            if (numPatients <= doctors){
                treatedPatients += numPatients;
            }else{
                treatedPatients += doctors;
                untreatedPatients += numPatients - doctors;
            }

        }
        System.out.printf("Treated patients: %d.\n",treatedPatients);
        System.out.printf("Untreated patients: %d.",untreatedPatients);
    }
}
