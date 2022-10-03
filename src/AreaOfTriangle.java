import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double ha = Double.parseDouble((scanner.nextLine()));
        double result = (a * ha) / 2;
        System.out.printf("%.2f", result);


    }
}
