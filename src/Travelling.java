import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String destination = scanner.nextLine();
            if(destination.equals("End"))
                break;
            double budget = Double.parseDouble(scanner.nextLine());
            double collectedSum = 0;
            while (collectedSum < budget){
                double savedAmount = Double.parseDouble(scanner.nextLine());
                collectedSum += savedAmount;
                System.out.printf("Collected: %.2f\n",collectedSum);
            }
            System.out.println("Going to " + destination + "!");
        }
    }
}
