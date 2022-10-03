import java.util.Scanner;

public class LatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);
        for (char ch = ch1; ch <= ch2; ch++)
            System.out.print(ch + " ");
    }
}
