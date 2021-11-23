import java.util.Scanner;

public class Main {

    public static void main(String[] args)
      {
        double a;
        double b;
        double answer;
        char Operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        a = scanner.nextDouble();
        System.out.println("Enter b");
        b = scanner.nextDouble();
        System.out.println("\n Enter the operation (+,-,/,*:)");
        Operation = scanner.next().charAt(0);
        switch (Operation) {
            case '+':
                answer = a + b;
                break;
            case '-':
                answer = a - b;
                break;
            case '/':
                answer = a / b;
                break;
            case '*':
                answer = a * b;
                break;
            default:
                System.out.println("Enter the correct operator");
                return;
        }
        System.out.println(answer);
    }
}
