import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String unit;
        double temp;
        double tempp;

        System.out.print("Which unit (C or F): ");
        unit = scanner.next().toUpperCase();

        if (unit.equals("C")) {
            System.out.print("Enter temperature in celcius: ");
            temp = scanner.nextDouble();
        } else {
            System.out.print("Enter temperature in fahrenheit: ");
            temp = scanner.nextDouble();
        }

        tempp = (unit.equals("C")) ? (temp * 9 / 5) + 32 : (temp - 32) * 5 / 9;

        System.out.printf("Temperature after conversion is %.2fº%s.\n", tempp, (unit.equals("C")) ? "F" : "C");
        scanner.close();
    }
}
