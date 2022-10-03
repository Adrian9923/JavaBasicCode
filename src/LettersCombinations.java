import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startLetter = scanner.nextLine().charAt(0);
        char endLetter = scanner.nextLine().charAt(0);
        char excludedLetter = scanner.nextLine().charAt(0);
        int counter = 0;
        for (char l1 = startLetter; l1 <= endLetter; l1++) {
            if(l1 != excludedLetter)
                for (char l2 = startLetter; l2 <= endLetter ; l2++) {
                    if (l2 != excludedLetter)
                        for (char l3 = startLetter; l3 <= endLetter; l3++) {
                            if(l3 != excludedLetter){
                                System.out.print("" + l1 + l2 + l3 + " ");
                                counter++;
                            }
                        }
                }
        }
        System.out.println(counter);
    }
}
