import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int seats = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        if(type.equals("Premiere")) {
            totalPrice += rows * seats * 12;
            System.out.printf("%.2f", totalPrice);
        }
        else if(type.equals("Normal")){
            totalPrice += rows * seats * 7.5;
            System.out.printf("%.2f", totalPrice);
        }
        else if(type.equals("Discount")){
            totalPrice += rows * seats * 5;
            System.out.printf("%.2f", totalPrice);
        }

    }
}
