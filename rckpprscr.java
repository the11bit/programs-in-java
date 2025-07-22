import java.util.Scanner;
import java.util.Random;
public class rckpprscr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String userChoice;
        String[] options = {"rock", "paper", "scissors"};
        String progChoice = options[random.nextInt(options.length)];
        System.out.println(progChoice);
        System.out.print("Enter your choice: ");
        userChoice = scanner.nextLine();

        if (userChoice.equals(progChoice)) {
                    System.out.println("It's a DRAW!");
        } 
        else if ((userChoice.equals("rock") && progChoice.equals("scissors")) ||
            (userChoice.equals("paper") && progChoice.equals("rock")) ||
            (userChoice.equals("scissors") && progChoice.equals("paper"))) {
                    System.out.println("You WIN!");
            } else {
                System.out.println("You LOSE!");
            }
        scanner.close();
    }
}
