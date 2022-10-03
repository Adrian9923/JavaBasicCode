import java.util.Scanner;

public class SpecialBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stopNum = scanner.nextInt();
        int prevNum = stopNum;
        while (true){
            int num = scanner.nextInt();
            if(stopNum == num) {
                break;
            }
            prevNum = num;
        }
        System.out.println(prevNum * 1.20);

    }
}
