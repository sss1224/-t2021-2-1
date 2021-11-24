import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please Enter any Number : ");
        number = scanner.nextInt();
        for (i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
