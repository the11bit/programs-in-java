import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a weekday: ");
        String weekday = scanner.nextLine().toLowerCase();

        switch (weekday) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                System.out.println("It's a weekday!");

            case "saturday", "sunday" -> // -> tells what to do now to compiler
                System.out.println("It's a weekend!");

            // else of if-else
            default -> System.out.println(weekday + " is not a day!");
        }

        // it can also be written like this but this process is lengthy.
        /*
         * switch (weekday) {
         * case "monday" ->
         * System.out.println("It's a weekday!");
         * case "tuesday" ->
         * System.out.println("It's a weekday!");
         * case "wednesday" ->
         * System.out.println("It's a weekday!");
         * case "thursday" ->
         * System.out.println("It's a weekday!");
         * case "friday" ->
         * System.out.println("It's a weekday!");
         * case "saturday" ->
         * System.out.println("It's a weekend!");
         * case "sunday" ->
         * System.out.println("It's a weekend!");
         * default ->
         * System.out.println(weekday + " is not a day!");
         * }
         */
        scanner.close();
    }
}
