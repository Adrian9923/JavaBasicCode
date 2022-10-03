import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Area = %.2f \n",area);
        System.out.printf("Perimeter = %.2f",perimeter);

    }
}
