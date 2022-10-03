import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = scanner.nextInt();

        if(points >= 0 && points <=3)
            points += 5;
        else if(points >=4 && points <= 6)
            points += 15;
        else if(points >= 7 && points <=9)
            points += 20;
        System.out.print(points);

    }
}
