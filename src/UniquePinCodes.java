import java.util.Scanner;

public class UniquePinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max1 = scanner.nextInt();
        int max2 = scanner.nextInt();
        int max3 = scanner.nextInt();
        for (int d1 = 2; d1 <= max1; d1+=2) {
            for (int d2 = 2; d2 <= max2; d2++) {
                if(d2 == 2 || d2 == 3 || d2 == 5 || d2 == 7){
                    for (int d3 = 2; d3 <= max3; d3+=2) {
                        System.out.println("" + d1 + d2 + d3);
                    }
                }
            }

        }
    }
}
