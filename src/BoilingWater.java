import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp = Double.parseDouble(scanner.nextLine());
        if(temp > 100)
            System.out.print("The water is boiling");
        else
            System.out.print("The water is not hot enough");

    }
}
