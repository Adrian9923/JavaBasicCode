import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        if(type.equals("square")){
            double num1 = scanner.nextDouble();
            double area = num1*num1;
            System.out.printf("%.2f", area);
        }
        else if(type.equals("rectangle")){
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double area = num1*num2;
            System.out.printf("%.2f",area);
        }
        else if(type.equals("circle"))
        {
            double num1 = scanner.nextDouble();
            double area = num1*num1*Math.PI;
            System.out.printf("%.2f",area);
        }
        else if(type.equals("triangle"))
        {
            double length = scanner.nextDouble();
            double height = scanner.nextDouble();
            double area = length*height/2;
            System.out.printf("%.2f",area);
        }

    }
}
