import java.util.Scanner;
import java.util.Random;
public class guessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userNum, progNum;
        progNum = random.nextInt(1, 10);
        if (progNum >= 6) {
            System.out.println("Hint: Number is too high.");
        } else if (progNum <= 5) {
            System.out.println("Hint: Number is too low.");
        }

        System.out.print("Guess the number from 1 to 10: ");
        userNum = scanner.nextInt();

        if (userNum == progNum) {
            System.out.println("You guessed it right!");
        } else {
            System.out.println("You are wrong! The correct number was " + progNum);
        }
        scanner.close();
    }
}