import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int firstDig = 1; firstDig <= 9 ; firstDig++) {
            for (int secondDig = 1; secondDig <= 9 ; secondDig++) {
                for (int thirdDig = 1; thirdDig <= 9 ; thirdDig++) {
                    int isMagic = firstDig * secondDig * thirdDig;
                    if(isMagic == n)
                        System.out.print("" + firstDig + secondDig + thirdDig + " ");
                }
            }
        }

    }
}
