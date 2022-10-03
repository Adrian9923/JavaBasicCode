import java.util.Scanner;

public class NumbersNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i >= 1 ; i--) {
            if(i<=n && i != 1)
                System.out.print(i + ", ");
            if (i == 1)
                System.out.println(i);
        }
    }
}
