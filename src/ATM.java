import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = Integer.parseInt(scanner.nextLine());
        int withdraw = Integer.parseInt(scanner.nextLine());
        int limit = Integer.parseInt(scanner.nextLine());

        if(balance > withdraw && withdraw < limit)
            System.out.println("The withdraw was successful.");
        else if(withdraw > limit)
            System.out.println("The limit was exceeded.");
        else if(balance < withdraw)
            System.out.println("Insufficient availability.");

    }
}
