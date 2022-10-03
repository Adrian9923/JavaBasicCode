import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String command = " ";
        while(!command.equals("End")) {
            command = scanner.nextLine();
            if (command.equals("Inc"))
                n += 1;
            else if (command.equals("Dec"))
                n -= 1;
        }
        System.out.println(n);

    }
}
