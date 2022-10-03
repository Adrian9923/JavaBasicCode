import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        for (int i = 0; i <= p; i++) {
            if (i % 2 == 0) {
                if(i>1)
                    System.out.print(", ");
                System.out.print((int) Math.pow(2, i));
            }
        }
    }
}
