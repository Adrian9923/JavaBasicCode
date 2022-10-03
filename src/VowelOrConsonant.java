import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String check = scanner.nextLine();
        if(check.equals("a") || check.equals("A") || check.equals("e") || check.equals("E") || check.equals("i") || check.equals("I") || check.equals("o") || check.equals("O") || check.equals("u") || check.equals("U"))
            System.out.print("Vowel");
        else
            System.out.print("Consonant");


    }
}
