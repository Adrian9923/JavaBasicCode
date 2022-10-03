import java.util.Scanner;

public class VacationExpanses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String type = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double expanses = 0;
        double discExp = 0;
        switch (season){
            case "Spring":
                if(type.equals("Hotel")){
                    expanses += (days * 30) * 0.2;
                    discExp += days * 30 - expanses;
                    System.out.printf("%.2f",discExp);
                }
                else if(type.equals("Camping"))
                {
                    expanses += (days * 10) * 0.2;
                    discExp += days * 10 - expanses;
                    System.out.printf("%.2f",discExp);
                }
                break;
            case "Summer":
                if(type.equals("Hotel")){
                    expanses += days * 50;
                    System.out.printf("%.2f",expanses);
                }
                else if(type.equals("Camping"))
                {
                    expanses += days * 30;
                    System.out.printf("%.2f",expanses);
                }
                break;
            case "Autumn":
                if(type.equals("Hotel")){
                    expanses += (days * 20) * 0.3;
                    discExp += days * 20 - expanses;
                    System.out.printf("%.2f",discExp);
                }
                else if(type.equals("Camping"))
                {
                    expanses += (days * 15) * 0.3;
                    discExp += days * 15 - expanses;
                    System.out.printf("%.2f",discExp);
                }
                break;
            case "Winter":
                if(type.equals("Hotel")){
                    expanses += (days * 40) * 0.1;
                    discExp += days * 40 - expanses;
                    System.out.printf("%.2f",discExp);
                }
                else if(type.equals("Camping"))
                {
                    expanses += (days * 10) * 0.1;
                    discExp += days * 10 - expanses;
                    System.out.printf("%.2f",discExp);
                }
                break;

        }

    }
}
