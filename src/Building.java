import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfFloors = scanner.nextInt();
        int estatesPerFloor = scanner.nextInt();
        for (int floor = countOfFloors; floor >= 1 ; floor--) {
            for (int estateFloor = 0; estateFloor < estatesPerFloor; estateFloor++) {
                String type = "A";
                if(floor % 2 == 0)
                    type = "O";
                if(floor == countOfFloors)
                    type = "L";
                System.out.print(type + floor + estateFloor + " ");
            }
            System.out.println();
        }

    }
}
