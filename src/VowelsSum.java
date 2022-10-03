import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = scanner.nextLine().charAt(0);
            if(ch == 'a')
                sum += 1;
            if(ch == 'e')
                sum += 2;
            if(ch == 'i')
                sum += 3;
            if(ch == 'o')
                sum += 4;
            if(ch == 'u')
                sum += 5;
        }
        System.out.println(sum);
    }
}
