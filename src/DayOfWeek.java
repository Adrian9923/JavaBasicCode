import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String check = scanner.nextLine();
        if(check.equals("1"))
            System.out.print("Monday");
        else if(check.equals("2"))
            System.out.print("Tuesday");
        else if(check.equals("3"))
            System.out.print("Wednesday");
        else if(check.equals("4"))
            System.out.print("Thursday");
        else if(check.equals("5"))
            System.out.print("Friday");
        else if(check.equals("6"))
            System.out.print("Saturday");
        else if(check.equals("7"))
            System.out.print("Sunday");
        else
            System.out.print("Error");

    }
}
