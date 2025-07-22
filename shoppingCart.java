import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int b;
        System.out.print("Enter your product name (no capital letters): ");
        a = sc.nextLine();
        System.out.print("How many " + a + "(s) have you ordered: ");
        b = sc.nextInt();
        if(a.equals("pizza")) {
            int i = 10 * b;
            System.out.println("Your total is: $" + i);
        } else if(a.equals("chocolate")) {
            int i = 5 * b;
            System.out.println("Your total is: $" + i);
        }
        sc.close();
    }
}