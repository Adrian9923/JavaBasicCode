import java.util.Scanner;

public class DivisionTo2And3And4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numDiv2 = 0;
        int numDiv3 = 0;
        int numDiv4 = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if(num % 2 == 0)
                numDiv2++;
            if (num % 3 == 0)
                numDiv3++;
            if(num % 4 == 0)
                numDiv4++;
        }
        double numDiv2Percentage = 100 * (double)numDiv2/n;
        double numDiv3Percentage = 100 * (double)numDiv3/n;
        double numDiv4Percentage = 100 * (double)numDiv4/n;
        System.out.printf("%.2f%%\n",numDiv2Percentage);
        System.out.printf("%.2f%%\n",numDiv3Percentage);
        System.out.printf("%.2f%%\n",numDiv4Percentage);
    }
}
