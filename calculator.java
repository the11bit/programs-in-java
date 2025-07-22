import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        int first = scanner.nextInt();
        System.out.print("Enter second operand: ");
        int second = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your operator (+ - * /): ");
        String operatr = scanner.nextLine();

        switch (operatr) {
            case "+":
                System.out.println(first + " + " + second + " = " + (first + second));
                break;
        
            case "-":
                System.out.println(first + " - " + second + " = " + (first - second));
                break;

            case "*":
                System.out.println(first + " * " + second + " = " + (first * second));
                break;

            case "/":
                System.out.println(first + " / " + second + " = " + (first / second));
                break;
        }
        scanner.close();
    }
}
