import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg;
        double lb;
        String unit;
        int weight;

        System.out.print("Enter your weight: ");
        weight = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your unit (kg/lb): ");
        unit = scanner.nextLine();

        lb = 2.2046;
        kg = 0.4536;

        if (unit.equals("kg")) {
            System.out.printf("Your weight in lbs is %.2f\n", weight * lb);
        } else if (unit.equals("lb")) {
            System.out.printf("Your weight in kgs is %.2f\n", weight * kg);
        }
        scanner.close();
    }
}