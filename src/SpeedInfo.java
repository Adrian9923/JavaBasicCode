import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());
        if(speed <= 30)
            System.out.print("Slow");
        else
            System.out.print("Fast");

    }
}
