import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true){
            String end = scanner.nextLine();
            if(end.equals("END"))
                break;
            int n =Integer.parseInt(end);
            if(n>max)
                max = n;
            if(n<min)
                min = n;
        }
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);

    }
}
