import java.util.Scanner;

public class Numbers1To9AsWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        if(number == 1)
            System.out.print("one");
        else if(number == 2)
            System.out.print("two");
        else if(number == 3)
            System.out.print("three");
        else if(number == 4)
            System.out.print("four");
        else if(number == 5)
            System.out.print("five");
        else if(number == 6)
            System.out.print("six");
        else if(number == 7)
            System.out.print("seven");
        else if(number == 8)
            System.out.print("eight");
        else if(number == 9)
            System.out.print("nine");
        else if(number >= 10)
            System.out.print("Out of range");

    }
}
