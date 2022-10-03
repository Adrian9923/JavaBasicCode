import java.util.Scanner;

public class Rollercoaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int places = scanner.nextInt();
        int minimumAge = scanner.nextInt();
        int countOfPeople = scanner.nextInt();
        int takenPlaces = 0;
        for (int i = 1; i <= countOfPeople; i++) {
            int peopleAge = scanner.nextInt();
            if(peopleAge >= minimumAge)
                takenPlaces++;
        }
        if(takenPlaces == places)
            System.out.println("The rollercoaster departures");
        else
            System.out.println("Waiting...");
    }
}
