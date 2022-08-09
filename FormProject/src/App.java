import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        NewUser user = new NewUser();

        System.out.print("Type your first name: ");
        user.setFirstName(input.nextLine());

        System.out.print("Type your last name:");
        user.setLastName(input.nextLine());

        System.out.print("Type your e-mail:");
        user.setEmail(input.nextLine());

        System.out.print("Type your password:");
        user.setPassword(input.nextLine());

        System.out.println("Welcome "+user.getFirstName()+" "+user.getLastName()+",\nThank you for registering on our website!"+"\nTo validate your account follow the step by step sent to "+user.getEmail());
    }
}
