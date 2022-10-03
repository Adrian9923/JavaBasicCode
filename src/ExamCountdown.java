import java.util.Scanner;

public class ExamCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d = Integer.parseInt(scanner.nextLine());
        for (int i = d; i >= 1; i--) {
            System.out.printf("%d days before the exam\n", i);
        }
        System.out.println("The exam has come");
    }
}
