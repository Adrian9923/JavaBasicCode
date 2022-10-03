import java.util.Scanner;

public class Numbers1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i+=3) {
            if(i>1)
                System.out.print(", ");
            System.out.print(i);
        }
        System.out.println();
    }
}
