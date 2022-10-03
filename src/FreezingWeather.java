import java.util.Scanner;

public class FreezingWeather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature = Integer.parseInt(scanner.nextLine());
        if(temperature <= 0)
        {
            System.out.print("Freezing weather!");
        }else
            System.out.print("");

    }
}
