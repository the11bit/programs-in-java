import java.util.Scanner;
public class pwStrgChckr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean isValid = true;
         if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            isValid = false;
        }
         if(!password.matches(".*[a-z].*")) {
            System.out.println("Password must contain at least 1 lower case letter.");
            isValid = false;
        }
         if (!password.matches(".*\\d.*")) {
            System.out.println("Password must contain at least 1 integer.");
            isValid = false;
        }
         if(!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least 1 upper case letter.");
            isValid = false;
        }
         if(!password.matches(".*[!@#$%^&*()].*")) {
            System.out.println("Password must contain at least 1 special character.");
            isValid = false;
         }   
         
         if (isValid) {
                System.out.println("Your password is great and strong!");
            }
        
        scanner.close();
    }
}