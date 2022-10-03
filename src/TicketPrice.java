import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        if(ticket.equals("student"))
            System.out.print("$1.00");
        else if(ticket.equals("regular"))
            System.out.print("$1.60");
        else
            System.out.print("Invalid ticket type!");

    }
}
