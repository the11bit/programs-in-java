import java.util.Scanner;
public class gradingSys {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    if (name.isEmpty()) {
        System.out.println("Please enter your name first.");
        return;
    } 
    System.out.println("Enter your marks for each subject below: ");
    System.out.print("1. Major: Computer Applications: ");
    int major = scanner.nextInt();
    System.out.print("1. Minor: Applied Computing: ");
    int minor = scanner.nextInt();
    System.out.print("1. Skill: Web Technologies: ");
    int skill = scanner.nextInt();
    System.out.print("1. AECC: English Language: ");
    int aecc = scanner.nextInt();
    System.out.print("1. MD: Arabic: ");
    int md = scanner.nextInt();

    int total = major + minor + skill + aecc + md;
    double perc = total / 500.0 * 100;
    
    System.out.println(total);
    System.out.printf("Your total percentage is: %.2f",perc);
    System.err.println();
    scanner.close();
   }}
